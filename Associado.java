

import java.time.LocalDate;

public class Associado extends Frequentador {

    public Associado(int id, String nome, String cpf, LocalDate dataFiliacao) {
        super(id, nome, cpf, dataFiliacao, 1, 3, 7, false);
    }

}
