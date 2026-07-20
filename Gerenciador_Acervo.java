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
        for (ItemAcervo itemAcervo : lista) {
            if(itemAcervo.getTitulo().equals(titulo)){
                lista.add(itemAcervo);
            }
        } 

        return lista;
    }

    public void realizarEmprestimo(Frequentador freq, ItemAcervo item){
        long itensAtivos = 0;
        for (Interacao interacao : historicoInteracoes) {
            if(interacao.getFrequentador().equals(freq) && interacao.getDataDevolucaoReal() == null){
                itensAtivos = itensAtivos + 1;
            }
            
        }
        if(itensAtivos >= freq.getLimiteItens()){
            System.out.println("Bloqueado: Limite de itens atingido para " + freq.getNome());
            return;
        }
        if(item.isRaro() && !freq.isAcessoRaros()){
            System.out.println("Bloqueado: "+ freq.getNome() + "Não tem permissão para itens raros");
            return;
        }

        if(!item.isDisponivel()){
            System.out.println("Item indisponivel.");
            return;
        }

        item.setDisponivel(false);
        LocalDate devolucaoprevista = LocalDate.now().plusDays(freq.getPrazoDias());

        Interacao novainInteracao = new Interacao(item, freq, "EMPRESTIMO", LocalDate.now(), devolucaoprevista);

        historicoInteracoes.add(novainInteracao);

        System.out.println("Emprestimo de '"+item.getTitulo()+"' realizado para " + freq.getNome());
        
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
            return;
        }

        multa = dias * taxaDiaria * interacao.getFrequentador().getModificadorMulta();

        if(multa > 0){
            System.out.println("Devolucao com atraso de "+dias+". Multa: R$ "+multa);
            return;
        }
        System.out.println("Devolução no prazo. Sem multas.");

    }

    public void cadastrarEvento(Evento evento){
        eventos.add(evento);

        System.out.println("EVENTO AGENDADO: "+ evento.getNome() +" no espaço "+evento.getLocal());
        for (ItemAcervo item : evento.getItens()) {
            item.setDisponivel(false);
            
            System.out.println("-> O item '"+ item.getTitulo() +"' foi recolhido para preparação do evento.\n");
        }
    }

    public void exibirRecomendacoes(Frequentador freq){
        System.out.println("Recomendações para: "+ freq.getNome() +"\n");
        ArrayList<ItemAcervo> recomendacoes = freq.obterRecomendacoesAutor(this.acervo);
        if (recomendacoes.isEmpty()){
            System.out.println("Não foi possivel gerar recomendações (Historico vazio).");
            return;
        }
        
            for(ItemAcervo item : recomendacoes){
                System.out.println("-> "+ item.getTitulo() +"\n");
            }
    }
}
