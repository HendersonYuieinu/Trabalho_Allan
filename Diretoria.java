


import java.time.LocalDate;

public class Diretoria extends Frequentador {

    public Diretoria(int id, String nome, String cpf, LocalDate dataFiliacao, double modificadorMulta, int limiteItens,
            int prazoDias, Boolean acessoRaros) {
        super(id, nome, cpf, dataFiliacao, 0.0, 100, 30, true);
    }

   

}
