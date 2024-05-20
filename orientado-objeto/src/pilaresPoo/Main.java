package pilaresPoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MotoristaService motorista = new MotoristaService();

        setandoValores(motorista, scanner);


    }

    private static void setandoValores(MotoristaService motorista, Scanner scanner) {

        String nomeDeEntrada;
        int idadeDeEntrada;

        System.out.println("Digite seu nome:" );
        nomeDeEntrada = scanner.next();
        System.out.println("Digite sua idade:" );
        idadeDeEntrada = scanner.nextInt();

        motorista.setar(nomeDeEntrada, idadeDeEntrada);
        motorista.mostrarIdadeENome();
    }
}

