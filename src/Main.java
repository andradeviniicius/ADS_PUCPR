import java.util.Scanner;

//4. Crie um algoritmo em Java que peça ao usuário para que se digite um número inteiro (exemplo: 14). Em seguida, o algoritmo deve mostrar a tabuada do número digitado utilizando o “for”.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero");
        int input = scanner.nextInt();

        for (int j = 0; j <= 10; j++) {
            System.out.println(j + "*" + input + "= " + input * j);
        }
    }
}
