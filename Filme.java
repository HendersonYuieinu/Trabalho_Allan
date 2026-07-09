package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class Filme extends ItemAcervo {

    private String diretor;
    private int ano;
    private int duracao;

    public Filme(int codigo, String titulo, LocalDate dataAquisicao,
                  String estadoConservacao, String localizacao,
                  String diretor, int ano, int duracao) {

        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao);

        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
    }
}