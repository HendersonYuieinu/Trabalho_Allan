import java.time.LocalDate;

public class Manuscrito extends ItemAcervo {

    private String datacao;
    private String estadoOriginal;
    
    public Manuscrito(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raroOuFragil, String datacao, String estadoOriginal) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raroOuFragil);
        this.datacao = datacao;
        this.estadoOriginal = estadoOriginal;
    }

    
}