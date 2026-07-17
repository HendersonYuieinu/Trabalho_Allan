
import java.time.LocalDate;
import java.util.ArrayList;

public class Frequentador {
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataFiliacao;
    private ArrayList<Interacao> historico;
    
    protected double modificadorMulta;
    protected int limiteItens;
    protected int prazoDias;
    protected boolean acessoRaros;

    public Frequentador(int id, String nome, String cpf, LocalDate dataFiliacao,double modificadorMulta, int limiteItens, int prazoDias, Boolean acessoRaros) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataFiliacao = dataFiliacao;
        this.modificadorMulta = modificadorMulta;
        this.limiteItens = limiteItens;
        this.prazoDias = prazoDias;
        this.acessoRaros = acessoRaros;

        historico = new ArrayList<>();
    }

    public void adicionarInteracao(Interacao interacao){
        historico.add(interacao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataFiliacao() {
        return dataFiliacao;
    }

    public void setDataFiliacao(LocalDate dataFiliacao) {
        this.dataFiliacao = dataFiliacao;
    }

    public ArrayList<Interacao> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Interacao> historico) {
        this.historico = historico;
    }

    public double getModificadorMulta() {
        return modificadorMulta;
    }

    public void setModificadorMulta(double modificadorMulta) {
        this.modificadorMulta = modificadorMulta;
    }

    public int getLimiteItens() {
        return limiteItens;
    }

    public void setLimiteItens(int limiteItens) {
        this.limiteItens = limiteItens;
    }

    public int getPrazoDias() {
        return prazoDias;
    }

    public void setPrazoDias(int prazoDias) {
        this.prazoDias = prazoDias;
    }

    public boolean isAcessoRaros() {
        return acessoRaros;
    }

    public void setAcessoRaros(boolean acessoRaros) {
        this.acessoRaros = acessoRaros;
    }
}