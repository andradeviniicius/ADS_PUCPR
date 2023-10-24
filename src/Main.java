//EXEMPLOExemplo de aplicação 6: crie um algoritmo em Java o qual informe ao usuário se um determinado número é igual a 1, igual a 2, igual a 3, ou se o número é diferente de 1, 2 e 3.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int numero = scanner.nextInt();

        if (numero == 1) {
            System.out.println("O número é igual a 1");
        } else if (numero == 2) {
            System.out.println("O número é igual a 2");
        } else if (numero == 3) {
            System.out.println("O número é igual a 3");
        } else {
            System.out.println("O número é diferente de 1, 2 e 3");
        }
    }
}

