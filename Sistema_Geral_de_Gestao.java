import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sistema_Geral_de_Gestao {

    public static void main(String[] args) {
        Gerenciador_Acervo gerenciador = new Gerenciador_Acervo();

        Livro livro1 = new Livro(1, "Donatelo caramujo", LocalDate.now(), "FISICO", false, true, "Machado de Sonin", "CLASSICO", "BRAIS", 208);
        Livro livro2 = new Livro(2, "Parada Cardiaca", LocalDate.now(), "DIGITAL", false, true, "Machado de Sonin", "LUXO", "BRAIS", 307);
        Livro livro3 = new Livro(3, "Estacoes do outono", LocalDate.now(), "FISICO", false, true, "Machado de Sonin", "CLASSICO", "BRAIS", 107);
        Livro livro4 = new Livro(4, "Curio da Alemanha", LocalDate.now(), "FISICO", false, true, "Kaua Silvano", "CLASSICO", "THOTH", 355);
        Livro livro5 = new Livro(5, "Linhas do Destino", LocalDate.now(), "DIGITAL", false, true, "Ramon Soares", "CLASSICO", "IFPA", 97);

        Manuscrito manuscritoepico = new Manuscrito(3, "Carta do Mestre Bimba", LocalDate.now(), "DIGITAL", true, true, "Mestre Bimba", "muito antigo", "FISICO");
        Filme documentario = new Filme(4, "Bruxa de Blair", LocalDate.now(), "DIGITAL", false, true, "Heather Donahue", "Heather Donahue", 1999, 3);

        Gravacao Opera = new Gravacao(3, "Opera dos deuses", LocalDate.now(), "DIGITAL", false, true, "Anjo Charlie Brwon", 10, "ALTA");
       
        gerenciador.cadastrarItem(livro1);
        gerenciador.cadastrarItem(livro2);
        gerenciador.cadastrarItem(livro3);
        gerenciador.cadastrarItem(livro4);
        gerenciador.cadastrarItem(livro5);

        gerenciador.cadastrarItem(manuscritoepico);
        gerenciador.cadastrarItem(documentario);
        gerenciador.cadastrarItem(Opera);

        Associado aluno = new Associado(1, "Chris", "001.223.445-09", LocalDate.now());
        Curador curador = new Curador(2, "Balestrin", "003.123.154-03", LocalDate.now());

        gerenciador.cadastrarFrequentador(aluno);
        gerenciador.cadastrarFrequentador(curador);


        // busca por titulo

        System.out.println("-----Busca no acervo-----\n");
        ArrayList<ItemAcervo> resultadobusca = gerenciador.buscarPorTitulo("Donatelo caramujo");
        if(resultadobusca.isEmpty()){
            System.out.println("Item nao encontrado.\n");
        }
        else{
            System.out.println("Item encontrado: "+ resultadobusca.getFirst().getTitulo()+"\n");
        }

        // emprestimo e regra de acesso

        System.out.println("-----Emprestimos-----");

        System.out.println("Chris pede 'Donatelo Caramujo'");
        Interacao emp1 = gerenciador.realizarEmprestimo(aluno, livro1);
        
        System.out.println("Chris pede 'Parada Cardiaca'");
        Interacao emp2 = gerenciador.realizarEmprestimo(aluno, livro2);

        System.out.println("Chris pega o documentario da bruxa de blair");
        Interacao emp3 = gerenciador.realizarEmprestimo(aluno, documentario);
        
        System.out.println("bloqueio, Chris pede 'Carta do Mestre Bimba' (item raro)");
        Interacao emp4 = gerenciador.realizarEmprestimo(aluno, manuscritoepico);

        System.out.println("Balestria (curador) pede 'Carta de Mestre Bimba'");
        Interacao emp5 = gerenciador.realizarEmprestimo(curador, manuscritoepico);
        
        // devolucao e multas

        System.out.println("-----Devolucoes-----\n");

        System.out.println("Simulando devolucao no prazo correto.");
        gerenciador.realizarDevolucao(emp1, LocalDate.now());

        System.out.println("Simulando atraso do Chris com o documentario");
        emp3.setDataDevolucaoPrevista(LocalDate.now().minusDays(5));

        gerenciador.realizarDevolucao(emp3, LocalDate.now());


        //  Evento cultural

        System.out.println("-----Evento cultural-----");

        Evento exposicao = new Evento("Semana de musica", LocalDateTime.now().plusDays(10), "Marina Sena", "JOVENS");
        exposicao.adicionarItem(Opera);
        gerenciador.cadastrarEvento(exposicao);

        System.out.println("Chris tenta pegar um item que esta no evento");
        gerenciador.realizarEmprestimo(aluno, Opera);

        // Recomendacoes
        System.out.println("-----Sistema de recomendacao (baseado no autor mais requisitado)-----\n");
        
        System.out.println("Sistema de recomendacao aplicada ao chris.\n");
        gerenciador.exibirRecomendacoes(aluno);

    }
}
