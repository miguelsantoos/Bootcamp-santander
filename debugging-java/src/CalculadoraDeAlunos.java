import java.util.Arrays;
import java.util.Scanner;

public class CalculadoraDeAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alunos[] = {"nota 1", "nota 2", "nota 3", "nota 4"};

        int media = calculo(alunos, scanner);

        System.out.printf("Media da turma é %s ", media);
    }

    public static int calculo(String[] alunos, Scanner scanner) {

        int soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
