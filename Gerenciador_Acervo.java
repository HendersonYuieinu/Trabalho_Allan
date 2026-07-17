import java.time.LocalDate;
import java.util.ArrayList;

public class Gerenciador_Acervo {
    private ArrayList<ItemAcervo> acervo = new ArrayList<>();
    private ArrayList<Frequentador> frequentadores = new ArrayList<>();
    private ArrayList<Interacao> historicoInteracoes = new ArrayList<>();

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
}
