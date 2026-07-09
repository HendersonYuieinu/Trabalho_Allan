package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class Manuscrito extends ItemAcervo {

    private String datacao;
    private String estadoOriginal;

    public Manuscrito(int codigo, String titulo, LocalDate dataAquisicao,
                      String estadoConservacao, String localizacao,
                      String datacao, String estadoOriginal) {

        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao);

        this.datacao = datacao;
        this.estadoOriginal = estadoOriginal;
    }
}