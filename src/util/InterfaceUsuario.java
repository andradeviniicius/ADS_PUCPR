// Classe InterfaceUsuario (pacote util)
package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

    private static Scanner scanner = new Scanner(System.in);

    // Método para pedir ao usuário o valor do imóvel
    public static double pedirValorImovel() {
        double valor = 0;
        boolean inputValido = false;

        do {
            try {
                System.out.print("Digite o valor do imóvel: R$ ");
                valor = scanner.nextDouble();

                if (valor > 0) {
                    inputValido = true;
                } else {
                    System.out.println("O valor do imóvel deve ser positivo. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        } while (!inputValido);

        return valor;
    }

    // Método para pedir ao usuário o prazo do financiamento
    public static int pedirPrazoFinanciamento() {
        int prazo = 0;
        boolean inputValido = false;

        do {
            try {
                System.out.print("Digite o prazo do financiamento em anos: ");
                prazo = scanner.nextInt();

                if (prazo > 0) {
                    inputValido = true;
                } else {
                    System.out.println("O prazo do financiamento deve ser positivo. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        } while (!inputValido);

        return prazo;
    }

    // Método para pedir ao usuário a taxa de juros
    public static double pedirTaxaJuros() {
        double taxa = 0;
        boolean inputValido = false;

        do {
            try {
                System.out.print("Digite a taxa de juros anual: ");
                taxa = scanner.nextDouble();

                if (taxa > 0) {
                    inputValido = true;
                } else {
                    System.out.println("A taxa de juros anual deve ser positiva. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        } while (!inputValido);

        return taxa;
    }

    // Método para pedir ao usuário o tamanho do terreno
    public static double pedirTamanhoTerreno() {
        double tamanhoTerreno = 0;
        boolean inputValido = false;

        do {
            try {
                System.out.print("Digite o tamanho do terreno: ");
                tamanhoTerreno = scanner.nextDouble();

                if (tamanhoTerreno > 0) {
                    inputValido = true;
                } else {
                    System.out.println("O tamanho do terreno deve ser positivo. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        } while (!inputValido);

        return tamanhoTerreno;
    }

    // Método para pedir ao usuário o tamanho da área construída
    public static double pedirTamanhoAreaConstruida() {
        double tamanhoAreaConstruida = 0;
        boolean inputValido = false;

        do {
            try {
                System.out.print("Digite o tamanho da área construída: ");
                tamanhoAreaConstruida = scanner.nextDouble();

                if (tamanhoAreaConstruida > 0) {
                    inputValido = true;
                } else {
                    System.out.println("O tamanho da área construída deve ser positivo. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        } while (!inputValido);

        return tamanhoAreaConstruida;
    }

    public static int pedirNumeroVagasGaragem() {
        int numeroVagas = 0;
        boolean inputValido = false;

        do {
            try {
                System.out.print("Digite o número de vagas na garagem: ");
                numeroVagas = scanner.nextInt();

                if (numeroVagas >= 0) {
                    inputValido = true;
                } else {
                    System.out.println("O número de vagas na garagem não pode ser negativo. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        } while (!inputValido);

        return numeroVagas;
    }

    // Método para pedir ao usuário o número do andar
    public static int pedirNumeroAndar() {
        int numeroAndar = 0;
        boolean inputValido = false;

        do {
            try {
                System.out.print("Digite o número do andar: ");
                numeroAndar = scanner.nextInt();

                if (numeroAndar >= 0) {
                    inputValido = true;
                } else {
                    System.out.println("O número do andar não pode ser negativo. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        } while (!inputValido);

        return numeroAndar;
    }

    // Método para pedir ao usuário o tipo de zona
    public static String pedirTipoZona() {
        String tipoZona = "";

        do {
            try {
                System.out.print("Digite o tipo de zona (exemplo: residencial ou comercial): ");
                tipoZona = scanner.next();

                if (!tipoZona.isEmpty()) {
                    break;
                } else {
                    System.out.println("O tipo de zona não pode ser vazio. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um texto.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        } while (true);

        return tipoZona;
    }

}
