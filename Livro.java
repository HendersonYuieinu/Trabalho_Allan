import java.time.LocalDate;

public class Livro extends ItemAcervo {

    private String edicao;
    private String editora;
    private int numeroPaginas;
    
    public Livro(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, String localizacao,
            boolean raro, boolean disponivel, String autor, String edicao, String editora, int numeroPaginas) {
        super(codigo, titulo, dataAquisicao, estadoConservacao, localizacao, raro, disponivel, autor);
        this.edicao = edicao;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }
    
   
  


}
