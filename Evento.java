

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(LocalDateTime dataHorario) {
        this.dataHorario = dataHorario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public ArrayList<ItemAcervo> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemAcervo> itens) {
        this.itens = itens;
    }
}
