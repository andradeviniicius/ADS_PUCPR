//Exemplo de aplicação 13: crie um algoritmo em Java contendo uma matriz numérica contendo três linhas e três colunas. Percorra cada elemento desta lista utilizando “for” e, em seguida, percorra com o “foreach”.
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Exemplo com o loop for:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento: " + matriz[i][j]);
            }
        }

        System.out.println("\n\nExemplo com o loop foreach:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.println("Elemento: " + elemento);
            }
        }
    }
}

