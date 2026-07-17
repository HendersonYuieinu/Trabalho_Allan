

import java.time.LocalDate;

public class ArteDigital extends ItemAcervo {

    private String resolucao;
    private String formatoArquivo;
    
    public ArteDigital(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raroOuFragil, String resolucao, String formatoArquivo) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raroOuFragil);
        this.resolucao = resolucao;
        this.formatoArquivo = formatoArquivo;
    }

    
}