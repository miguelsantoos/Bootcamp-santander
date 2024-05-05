import java.util.Scanner;

public class ExemploWhileSecond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opicao;
        System.out.println("Selecione opição 1 para sair e 2 para continuar:");
        opicao = scanner.nextInt();

        while (opicao==2) {
            String nome;

            System.out.println("Digite seu primiero nome:");
            nome = scanner.next();

            System.out.println("Seu nome é: " + nome);

            System.out.println("Selecione opição 1 para sair e 2 para continuar");
            opicao = scanner.nextInt();
        }

        System.out.println("Obrigado pela participação");
    }

}
