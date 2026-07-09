package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;
import java.util.ArrayList;

public class Frequentador {

    private String nome;
    private String cpf;
    private LocalDate dataFiliacao;
    private ArrayList<Interacao> historico;

    public Frequentador(String nome, String cpf, LocalDate dataFiliacao) {

        this.nome = nome;
        this.cpf = cpf;
        this.dataFiliacao = dataFiliacao;

        historico = new ArrayList<>();
    }

    public void adicionarInteracao(Interacao interacao){
        historico.add(interacao);
    }
}