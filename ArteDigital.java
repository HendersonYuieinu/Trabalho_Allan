


import java.time.LocalDate;

public class ArteDigital extends ItemAcervo {

    private String resolucao;
    private String formatoArquivo;
    

   
    public ArteDigital(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, boolean raro,
            boolean disponivel, String autor, String resolucao, String formatoArquivo) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, raro, disponivel, autor);
        this.resolucao = resolucao;
        this.formatoArquivo = formatoArquivo;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }
    
   



    
}