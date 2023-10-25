import java.util.Scanner;

//6. Crie um algoritmo em Java que solicita um número inteiro ao usuário. Em seguida, deve-se verificar se o número digitado é ou não é um número primo.
public class Main {
    public static void main(String[] args) {

        
        // Números primos são números que têm apenas 2 fatores: 1 e ele mesmo. Por exemplo, os 5 primeiros números primos são 2, 3, 5, 7 e 11.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero");
        int input = scanner.nextInt();
        boolean primo = true;


        if (input <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(input); i++) {
                if (input % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

    }
}
