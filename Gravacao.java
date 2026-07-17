
import java.time.LocalDate;

public class Gravacao extends ItemAcervo {

    private int duracao;
    private String qualidadeAudio;
    
    public Gravacao(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raroOuFragil, int duracao, String qualidadeAudio) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raroOuFragil);
        this.duracao = duracao;
        this.qualidadeAudio = qualidadeAudio;
    }

 
}