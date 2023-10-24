import java.util.Scanner;

//1. Crie um algoritmo em Java que solicita três números decimais ao usuário.
// Em seguida, a média destes números é calculada e mostrada na tela para o usuário.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1- Insira 1 numero de 0 a 10");
        int input1 = scanner.nextInt();

        System.out.println("2- Insira 1 numero de 0 a 10");
        int input2 = scanner.nextInt();

        System.out.println("3- Insira 1 numero de 0 a 10");
        int input3 = scanner.nextInt();

        System.out.println((input1 + input2 + input3) / 3);

    }
}
