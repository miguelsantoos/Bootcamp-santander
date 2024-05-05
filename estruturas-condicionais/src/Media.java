import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        int nota1;
        int nota2;
        int nota3;
        int nota4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota 1: ");
        nota1 = scanner.nextInt();

        System.out.println("Digite sua nota 2: ");
        nota2 = scanner.nextInt();

        System.out.println("Digite sua nota 3: ");
        nota3 = scanner.nextInt();

        System.out.println("Digite sua nota 4: ");
        nota4 = scanner.nextInt();

        int media = (nota1+nota2+nota3+nota4)/4;

        if (media >= 6) {
            System.out.println("Aprovado com nota " + media);
        }else {
            System.out.println("Reprovado com nota " + media);
        }
    }
}
