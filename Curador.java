
import java.time.LocalDate;

public class Curador extends Frequentador {

    public Curador(int id, String nome, String cpf, LocalDate dataFiliacao) {
        super(id, nome, cpf, dataFiliacao, 0,10, 30, true);
    }

}