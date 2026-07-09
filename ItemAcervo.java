package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class ItemAcervo {

    private int codigo;
    private String titulo;
    private LocalDate dataAquisicao;
    private String estadoConservacao;
    private String localizacao;

    public ItemAcervo(int codigo, String titulo, LocalDate dataAquisicao,
                      String estadoConservacao, String localizacao) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.dataAquisicao = dataAquisicao;
        this.estadoConservacao = estadoConservacao;
        this.localizacao = localizacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
