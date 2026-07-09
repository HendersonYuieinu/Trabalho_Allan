package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class Interacao {

    private ItemAcervo item;
    private Frequentador frequentador;
    private String tipo;
    private LocalDate data;

    public Interacao(ItemAcervo item, Frequentador frequentador,
                     String tipo, LocalDate data) {

        this.item = item;
        this.frequentador = frequentador;
        this.tipo = tipo;
        this.data = data;
    }

}
