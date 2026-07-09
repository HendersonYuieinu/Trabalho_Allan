package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;

public class Associado extends Frequentador {

    public Associado(String nome, String cpf, LocalDate dataFiliacao) {
        super(nome, cpf, dataFiliacao);
    }

}
