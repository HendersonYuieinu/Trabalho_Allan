

import java.time.LocalDate;

public class Pesquisador extends Frequentador {

    public Pesquisador(int id, String nome, String cpf, LocalDate dataFiliacao) {
        super(id, nome, cpf, dataFiliacao, 0.5, 5, 15, true);
    }

}
