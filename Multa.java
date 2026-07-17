import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Multa {
    private Interacao interacaoOrigem;
    private double valor;
    private long diasAtraso;
    private boolean paga;
    private double valorPorDia;
    private double modificador;
    
    public Multa(Interacao interacaoOrigem, boolean paga) {
        this.interacaoOrigem = interacaoOrigem;
        this.paga = paga;

        this.diasAtraso = ChronoUnit.DAYS.between(interacaoOrigem.getDataDevolucaoPrevista(), interacaoOrigem.getDataDevolucaoReal());
        this.valorPorDia = 2.00;
        this.modificador = interacaoOrigem.getFrequentador().getModificadorMulta();

    }   

    public void calcularMulta(){
        
        LocalDate dataPrevista = interacaoOrigem.getDataDevolucaoPrevista();
        LocalDate dataDevolucaoReal = interacaoOrigem.getDataDevolucaoReal();

        if(dataDevolucaoReal.isBefore(dataPrevista) || dataDevolucaoReal.isEqual(dataPrevista)){
            this.valor = 0.0;
            return;
        }
        if(modificador == 0.0){
            this.valor = 0.0;
            return;
        }

        this.valor = diasAtraso * valorPorDia * modificador;
        return; 

    }

    public Interacao getInteracaoOrigem() {
        return interacaoOrigem;
    }

    public void setInteracaoOrigem(Interacao interacaoOrigem) {
        this.interacaoOrigem = interacaoOrigem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public double getValorPorDia() {
        return valorPorDia;
    }

    public void setValorPorDia(double valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    public double getModificador() {
        return modificador;
    }

    public void setModificador(double modificador) {
        this.modificador = modificador;
    }
    
    
}
