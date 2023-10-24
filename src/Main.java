//EXEMPLOExemplo de aplicação 7: converta o código a seguir de Python para Java.

import java.util.Scanner;

public class Main {
    /*
    *   contador = 1
        while contador <= 5:
        print("Contagem:", contador)
        contador += 1
    * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int contador = scanner.nextInt();

        while (contador <= 5) {
            System.out.println("Contagem: " + contador);
            contador++;
        }

    }
}

