import java.time.LocalDate;

public class Manuscrito extends ItemAcervo {

    private String datacao;
    private String estadoOriginal;
    public Manuscrito(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raro, boolean disponivel, String autor, String datacao, String estadoOriginal) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raro, disponivel, autor);
        this.datacao = datacao;
        this.estadoOriginal = estadoOriginal;
    }
    public String getDatacao() {
        return datacao;
    }
    public void setDatacao(String datacao) {
        this.datacao = datacao;
    }
    public String getEstadoOriginal() {
        return estadoOriginal;
    }
    public void setEstadoOriginal(String estadoOriginal) {
        this.estadoOriginal = estadoOriginal;
    }


  


    
}