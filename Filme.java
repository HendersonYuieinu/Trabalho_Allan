

import java.time.LocalDate;

public class Filme extends ItemAcervo {

    private String diretor;
    private int ano;
    private int duracao;
    public Filme(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raro, boolean disponivel, String autor, String diretor, int ano, int duracao) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raro, disponivel, autor);
        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
    }
    
   





}