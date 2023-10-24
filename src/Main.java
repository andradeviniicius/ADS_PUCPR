//Exemplo de aplicação 5: converta o código a seguir de Python para Java:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
       *    idade = int(input("Digite sua idade: "))
            if idade < 18:
                print("Você é menor de idade.")
            elif idade >= 18 and idade < 60:
                print("Você é adulto.")
            else:
                print("Você é um(a) idoso(a).")
       * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Voce é menor de idade");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é um(a) idoso(a).");
        }

    }
}