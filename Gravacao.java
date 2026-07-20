
import java.time.LocalDate;

public class Gravacao extends ItemAcervo {

    private int duracao;
    private String qualidadeAudio;
    
    public Gravacao(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raro, boolean disponivel, String autor, int duracao, String qualidadeAudio) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raro, disponivel, autor);
        this.duracao = duracao;
        this.qualidadeAudio = qualidadeAudio;
    }
    
    

  


 
}