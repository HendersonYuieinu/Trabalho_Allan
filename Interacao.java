
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Interacao {
    private int id;
    private ItemAcervo item;
    private Frequentador frequentador;
    private String tipo; //CONSULTA, EMPRESTIMO, ACESSO_DIGITAL, RESERVA 
    private LocalDateTime data;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;
    
    public Interacao(int id, ItemAcervo item, Frequentador frequentador, String tipo, LocalDateTime data,
            LocalDate dataDevolucaoPrevista, LocalDate dataDevolucaoReal) {
        this.id = id;
        this.item = item;
        this.frequentador = frequentador;
        this.tipo = tipo;
        this.data = data;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemAcervo getItem() {
        return item;
    }

    public void setItem(ItemAcervo item) {
        this.item = item;
    }

    public Frequentador getFrequentador() {
        return frequentador;
    }

    public void setFrequentador(Frequentador frequentador) {
        this.frequentador = frequentador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(LocalDate dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }



 

}
