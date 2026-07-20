

import java.time.LocalDate;

public class Gravacao extends ItemAcervo {

    private int duracao;
    private String qualidadeAudio;

   
    public Gravacao(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, boolean raro,
            boolean disponivel, String autor, int duracao, String qualidadeAudio) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, raro, disponivel, autor);
        this.duracao = duracao;
        this.qualidadeAudio = qualidadeAudio;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getQualidadeAudio() {
        return qualidadeAudio;
    }

    public void setQualidadeAudio(String qualidadeAudio) {
        this.qualidadeAudio = qualidadeAudio;
    }
    
    

  


 
}