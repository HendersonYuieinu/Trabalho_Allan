package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class Curador extends Frequentador {

    public Curador(String nome, String cpf, LocalDate dataFiliacao) {
        super(nome, cpf, dataFiliacao);
    }

}