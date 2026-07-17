
import java.time.LocalDate;

public class Partitura extends ItemAcervo {

    private String compositor;
    private String instrumentacao;
    public Partitura(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raro, boolean disponivel, String compositor, String instrumentacao) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raro, disponivel);
        this.compositor = compositor;
        this.instrumentacao = instrumentacao;
    }

   

}