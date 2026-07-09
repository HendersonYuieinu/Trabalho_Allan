package com.mycompany.sistema_geral_de_gestao;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {

    private String nome;
    private LocalDate data;
    private String horario;
    private String responsavel;
    private String publicoAlvo;

    private ArrayList<ItemAcervo> itens;

    public Evento(String nome, LocalDate data, String horario,
                  String responsavel, String publicoAlvo) {

        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.responsavel = responsavel;
        this.publicoAlvo = publicoAlvo;

        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemAcervo item){
        itens.add(item);
    }
}
