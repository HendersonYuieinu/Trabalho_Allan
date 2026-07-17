

import java.time.LocalDate;

public class ItemAcervo {

    private int codigo;
    private String titulo;
    private LocalDate dataAquisicao;
    private String estadoConservacao;
    private String localizacao;
    private boolean raro;
    private boolean disponivel;

    public ItemAcervo(int codigo, String titulo, LocalDate dataAquisicao,
                      String estadoConservacao, String localizacao, boolean raro, boolean disponivel) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.dataAquisicao = dataAquisicao;
        this.estadoConservacao = estadoConservacao;
        this.localizacao = localizacao;
        this.raro = raro;
        this.disponivel = disponivel;
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

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
