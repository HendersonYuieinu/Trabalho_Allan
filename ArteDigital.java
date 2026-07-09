package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class ArteDigital extends ItemAcervo {

    private String resolucao;
    private String formatoArquivo;

    public ArteDigital(int codigo, String titulo, LocalDate dataAquisicao,
                       String estadoConservacao, String localizacao,
                       String resolucao, String formatoArquivo) {

        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao);

        this.resolucao = resolucao;
        this.formatoArquivo = formatoArquivo;
    }
}