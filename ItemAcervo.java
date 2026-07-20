


import java.time.LocalDate;

public class ItemAcervo {

    private int codigo;
    private String titulo;
    private LocalDate dataAquisicao;
    private String estadoConservacao;
    private boolean raro;
    private boolean disponivel;
    private String autor;


    public ItemAcervo(int codigo, String titulo, LocalDate dataAquisicao, String estadoConservacao, boolean raro,
            boolean disponivel, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataAquisicao = dataAquisicao;
        this.estadoConservacao = estadoConservacao;
        this.raro = raro;
        this.disponivel = disponivel;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public boolean isRaro() {
        return raro;
    }

    public void setRaro(boolean raro) {
        this.raro = raro;
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


    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
