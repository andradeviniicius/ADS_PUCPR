import java.util.Scanner;

//2. Crie um algoritmo em Java que verifica se um número inteiro é positivo, negativo ou zero.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira 1 numero");
        int input1 = scanner.nextInt();

        if (input1 > 0) {
            System.out.println("positivo");
        } else if (input1 < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("zero");
        }
    }
}
