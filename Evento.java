
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Evento {

    private String nome;
    private LocalDateTime dataHorario;
    private String local;
    private String responsavel;
    private String publicoAlvo;
    private ArrayList<ItemAcervo> itens;

    public Evento(String nome, LocalDateTime dataHorario,
                  String responsavel, String publicoAlvo) {

        this.nome = nome;
        this.dataHorario = dataHorario;
        this.responsavel = responsavel;
        this.publicoAlvo = publicoAlvo;

        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemAcervo item){
        itens.add(item);
    }
}
