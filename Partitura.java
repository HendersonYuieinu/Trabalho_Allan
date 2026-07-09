package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class Partitura extends ItemAcervo {

    private String compositor;
    private String instrumentacao;

    public Partitura(int codigo, String titulo, LocalDate dataAquisicao,
                     String estadoConservacao, String localizacao,
                     String compositor, String instrumentacao) {

        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao);

        this.compositor = compositor;
        this.instrumentacao = instrumentacao;
    }
}