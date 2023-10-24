//Exemplo de aplicação 11: crie um algoritmo em Java contendo uma lista com cinco números. Percorra cada elemento desta lista utilizando “for” e, em seguida, percorra com o “foreach”.
public class Main {

    public static void main(String[] args) {
        // Exemplo de uso do break

        System.out.println("Exemplo com break:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Encerra o loop quando i == 3
            }
            System.out.println("Número: " + i);
        }
        System.out.println();

        // Exemplo de uso do continue

        System.out.println("Exemplo com continue:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Pula para a próxima iteração quando i == 3
            }
            System.out.println("Número: " + i);
        }
    }
}