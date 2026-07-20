
import java.time.LocalDate;

public class Partitura extends ItemAcervo {

    private String instrumentacao;

    public Partitura(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raro, boolean disponivel, String autor, String instrumentacao) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raro, disponivel, autor);
        this.instrumentacao = instrumentacao;
    }
    

   

}