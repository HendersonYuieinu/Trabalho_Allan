package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class Fotografia extends ItemAcervo {

    private String tecnica;
    private String dimensoes;

    public Fotografia(int codigo, String titulo, LocalDate dataAquisicao,
                      String estadoConservacao, String localizacao,
                      String tecnica, String dimensoes) {

        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao);

        this.tecnica = tecnica;
        this.dimensoes = dimensoes;
    }
}