

import java.time.LocalDate;

public class Filme extends ItemAcervo {

    private String diretor;
    private int ano;
    private int duracao;
    
    public Filme(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raroOuFragil, String diretor, int ano, int duracao) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raroOuFragil);
        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
    }


}