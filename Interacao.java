
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Interacao {
    private ItemAcervo item;
    private Frequentador frequentador;
    private String tipo; //CONSULTA, EMPRESTIMO, ACESSO_DIGITAL, RESERVA 
    private LocalDate data;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;
    
 

    public Interacao(ItemAcervo item, Frequentador frequentador, String tipo, LocalDate data,
            LocalDate dataDevolucaoPrevista) {
        this.item = item;
        this.frequentador = frequentador;
        this.tipo = tipo;
        this.data = data;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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
