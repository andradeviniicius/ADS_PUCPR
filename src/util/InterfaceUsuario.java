package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

//    b. Classe InterfaceUsuario (no pacote util):
//
//    i. Ajuste os métodos de entrada de dados (valor do imóvel, prazo de financiamento e taxa de juros) para que usem estruturas condicionais (como if/else ou switch) dentro dos seus métodos para verificar se as entradas fornecidas pelo usuário são válidas.
//
//    ii. Aceite somente valores positivos para o valor do imóvel, prazo do financiamento e taxa de juros anual.
//
//    iii. Use estruturas de repetição (como do, do-while ou for). Se algum dos valores for inválido, o programa deve informar ao usuário sobre o erro e solicitar que ele insira novamente os dados.

    public int valorImovel() {

        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.println("valor do imovel?");
            try {
                input = scanner.nextInt();
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Favor inserir um número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor inserir um número válido.");
                scanner.next();
            }
        }
        return input;
    }

    public int prazoFinanciamento() {

        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.println("prazo financiamento?");
            try {
                input = scanner.nextInt();
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Favor inserir um número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor inserir um número válido.");
                scanner.next();
            }
        }
        return input;
    }


    public int valorJurosAnual() {

        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.println("valor dos juros?");
            try {
                input = scanner.nextInt();
                if (input >= 0  && input <= 25) {
                    break;
                } else {
                    System.out.println("Você nao pode inserir uma taxa de juros abusiva e nem negativa.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor inserir um número válido.");
                scanner.next();
            }
        }
        return input;
    }

}
