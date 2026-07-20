import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Gerenciador_Acervo {
    private ArrayList<ItemAcervo> acervo = new ArrayList<>();
    private ArrayList<Frequentador> frequentadores = new ArrayList<>();
    private ArrayList<Interacao> historicoInteracoes = new ArrayList<>();
    private ArrayList<Evento> eventos = new ArrayList<>();

    public void cadastrarItem(ItemAcervo item){
        acervo.add(item);
    }

    public void cadastrarFrequentador(Frequentador freq){
        frequentadores.add(freq);
    }

    public ArrayList<ItemAcervo> buscarPorTitulo(String titulo){
        ArrayList<ItemAcervo>lista = new ArrayList<>();
        for (ItemAcervo itemAcervo : this.acervo) {
            if(itemAcervo.getTitulo().equals(titulo)){
                lista.add(itemAcervo);
            }
        } 

        return lista;
    }

    public Interacao realizarEmprestimo(Frequentador freq, ItemAcervo item){
        long itensAtivos = 0;
        for (Interacao interacao : getHistoricoInteracoes()) {
            if(interacao.getFrequentador().equals(freq) && interacao.getDataDevolucaoReal() == null){
                itensAtivos = itensAtivos + 1;
            }
            
        }
        if(itensAtivos >= freq.getLimiteItens()){
            System.out.println("Bloqueado: Limite de itens atingido para " + freq.getNome()+"\n");
            return null;
        }
        if(item.isRaro() && !freq.isAcessoRaros()){
            System.out.println("Bloqueado: "+ freq.getNome() + " Não tem permissão para itens raros\n");
            return null;
        }

        if(!item.isDisponivel()){
            System.out.println("Item indisponivel.\n");
            return null;
        }

        LocalDate devolucaoprevista = LocalDate.now().plusDays(freq.getPrazoDias());
        
        Interacao novainInteracao = new Interacao(item, freq, "EMPRESTIMO", LocalDate.now(), devolucaoprevista);
        freq.getHistorico().add(novainInteracao);
        historicoInteracoes.add(novainInteracao);
        item.setDisponivel(false);

        System.out.println("Emprestimo de '"+item.getTitulo()+"' realizado para " + freq.getNome() +"\n");
        return novainInteracao;

    }


    public void realizarDevolucao(Interacao interacao, LocalDate dataDevolucaoReal) {
        interacao.setDataDevolucaoReal((dataDevolucaoReal));
        ItemAcervo item = interacao.getItem();
        item.setDisponivel(true);

        LocalDate prevista = interacao.getDataDevolucaoPrevista();
        long dias = ChronoUnit.DAYS.between(prevista, dataDevolucaoReal);
        double taxaDiaria = 2.00;

        double multa = 0;

        if(dataDevolucaoReal.isBefore(prevista) || dataDevolucaoReal.isEqual(prevista)){
            System.out.println("Devolução no prazo. Sem multas.\n");
            return;
        }

        multa = dias * taxaDiaria * interacao.getFrequentador().getModificadorMulta();

        if(multa > 0){
            System.out.println("Devolucao com atraso de "+dias+" dias. Multa: R$ "+multa+"\n");
            return;
        }

    }

    public void cadastrarEvento(Evento evento){
        eventos.add(evento);

        System.out.println("EVENTO AGENDADO: "+ evento.getNome());
        for (ItemAcervo item : evento.getItens()) {
            item.setDisponivel(false);
            
            System.out.println("-> O item '"+ item.getTitulo() +"' foi recolhido para preparação do evento.\n");
        }
    }

    public void exibirRecomendacoes(Frequentador freq){
        System.out.println("Recomendações para: "+ freq.getNome() +"\n");
        ArrayList<ItemAcervo> recomendacoes = freq.obterRecomendacoesAutor(getAcervo());
        if (recomendacoes.isEmpty()){
            System.out.println("Não foi possivel gerar recomendações (Historico vazio).");
            return;
        }
        
            for(ItemAcervo item : recomendacoes){
                System.out.println("-> "+ item.getTitulo()+", de "+item.getAutor());
            }
    }

    public ArrayList<ItemAcervo> getAcervo() {
        return acervo;
    }

    public void setAcervo(ArrayList<ItemAcervo> acervo) {
        this.acervo = acervo;
    }

    public ArrayList<Frequentador> getFrequentadores() {
        return frequentadores;
    }

    public void setFrequentadores(ArrayList<Frequentador> frequentadores) {
        this.frequentadores = frequentadores;
    }

    public ArrayList<Interacao> getHistoricoInteracoes() {
        return historicoInteracoes;
    }

    public void setHistoricoInteracoes(ArrayList<Interacao> historicoInteracoes) {
        this.historicoInteracoes = historicoInteracoes;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
}
