

import java.time.LocalDate;

public class Fotografia extends ItemAcervo {

    private String tecnica;
    private String dimensoes;

 
    public Fotografia(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, boolean raro,
            boolean disponivel, String autor, String tecnica, String dimensoes) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, raro, disponivel, autor);
        this.tecnica = tecnica;
        this.dimensoes = dimensoes;
    }
    public String getTecnica() {
        return tecnica;
    }
    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }
    public String getDimensoes() {
        return dimensoes;
    }
    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }
    
    


}