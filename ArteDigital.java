

import java.time.LocalDate;

public class ArteDigital extends ItemAcervo {

    private String resolucao;
    private String formatoArquivo;
    
    public ArteDigital(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raro, boolean disponivel, String resolucao, String formatoArquivo) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raro, disponivel);
        this.resolucao = resolucao;
        this.formatoArquivo = formatoArquivo;
    }



    
}