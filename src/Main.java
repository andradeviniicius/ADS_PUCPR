//EXEMPLOExemplo de aplicação 8: converta o código a seguir de Python para Java.

import java.util.Scanner;

public class Main {
    /*
    *   numero = 0
            while True:
                print("Número:", numero)
                numero += 1
                    if numero >= 5:
                    break
    * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero < 5);
    }
}

