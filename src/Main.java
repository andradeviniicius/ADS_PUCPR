import java.util.Scanner;

//3. Crie um algoritmo em Java que mostre na tela todos os múltiplos de 3 entre os números 0 e 30 usando a estrutura “do while”.
public class Main {
    public static void main(String[] args) {

        int contador = 0;
        int quantidadeDeMultiplos = 0;

        do {

            if (contador > 0) {
                if (contador % 3 == 0) {
                    quantidadeDeMultiplos++;
                }
            }

            contador++;
        } while (contador <= 30);

        System.out.println(quantidadeDeMultiplos);
    }
}
