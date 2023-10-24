//Exemplo de aplicação 3: crie um código em Java o qual mostre na tela o nome, idade e altura de uma pessoa. Estas três informações deverão ficar armazenadas em três variáveis.

public class Main {

    public static void main(String[] args) {
        // Variáveis com diferentes tipos de dados

        String nome = "Rafaela";
        int idade = 32;
        double altura = 1.65;

        // Exemplo 1: Uso do System.out.println para exibir dados

        System.out.println("Exemplo 1:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome + ", Altura: " + altura);

        // Exemplo 2: Uso do System.out.print para exibir dados

        System.out.print("\nExemplo 2:\n");
        System.out.print("Nome: " + nome + "\n");
        System.out.print("Idade: " + idade + "\n");
        System.out.print("Altura: " + altura + "\n");
        System.out.print("Nome: " + nome + ", Altura: " + altura + "\n");

        // Exemplo 3: Uso do System.out.printf para formatar e exibir dados

        System.out.println("\nExemplo 3:");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Altura: %.2f\n", altura);
        System.out.printf("Nome: %s, Altura: %.2f\n", nome, altura);
        System.out.println();

        // Exemplo 4: Uso do System.out.format para formatar e exibir dados

        System.out.println("\nExemplo 4:");
        System.out.format("Nome: %s\n", nome);
        System.out.format("Idade: %d\n", idade);
        System.out.format("Altura: %.2f\n", altura);
        System.out.format("Nome: %s, Altura: %.2f\n", nome, altura);
        System.out.println();

        // Exemplo 5: Uso do StringBuilder para construir a mensagem

        System.out.println("\nExemplo 5:");
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Nome: ").append(nome).append("\n");
        mensagem.append("Idade: ").append(idade).append("\n");
        mensagem.append("Altura: ").append(altura).append("\n");
        mensagem.append("Nome: ").append(nome).append(", Altura: ").append(altura).append("\n");
        System.out.println(mensagem);
    }
}