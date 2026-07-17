
import java.time.LocalDate;

public class Fotografia extends ItemAcervo {

    private String tecnica;
    private String dimensoes;
    
    public Fotografia(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raro, boolean disponivel, String tecnica, String dimensoes) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raro, disponivel);
        this.tecnica = tecnica;
        this.dimensoes = dimensoes;
    }


}