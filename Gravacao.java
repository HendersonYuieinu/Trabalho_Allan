package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class Gravacao extends ItemAcervo {

    private int duracao;
    private String qualidadeAudio;

    public Gravacao(int codigo, String titulo, LocalDate dataAquisicao,
                    String estadoConservacao, String localizacao,
                    int duracao, String qualidadeAudio) {

        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao);

        this.duracao = duracao;
        this.qualidadeAudio = qualidadeAudio;
    }
}