import java.util.Scanner;

//5. Crie um algoritmo em Java que peça ao usuário para que se digite um ano (exemplo: 2032). Em seguida, o algoritmo deve verificar se o ano informado é ou não bissexto.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um ano");
        int input = scanner.nextInt();

        if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano normal");

        }
    }
}
