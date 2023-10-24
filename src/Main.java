//EXEMPLOExemplo de aplicação 6: crie um algoritmo em Java o qual informe ao usuário se um determinado número é igual a 1, igual a 2, igual a 3, ou se o número é diferente de 1, 2 e 3.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("O número é igual a 1");
                break;
            case 2:
                System.out.println("O número é igual a 2");
                break;
            case 3:
                System.out.println("O número é igual a 3");
                break;
            default:
                System.out.println("O número é diferente de 1, 2 e 3");
                break;
        }
    }
}

