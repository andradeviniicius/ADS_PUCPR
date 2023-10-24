import java.util.Scanner;


public class Main {

//    # Exemplo em Python
//    numero = int(input("Digite um número: "))
//
//            if numero > 0:
//    print("O número é positivo.")
//    elif numero < 0:
//    print("O número é negativo.")
//    else:
//    print("O número é zero.")

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}