package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class Livro extends ItemAcervo {

    private String edicao;
    private String editora;
    private int numeroPaginas;

    public Livro(int codigo, String titulo, LocalDate dataAquisicao,
                 String estadoConservacao, String localizacao,
                 String edicao, String editora, int numeroPaginas) {

        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao);

        this.edicao = edicao;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }
}
