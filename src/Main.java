import java.util.Scanner;

//8. Desenvolva um algoritmo em Java que peça ao usuário um número inteiro n e gere um padrão de asteriscos. Por exemplo, se n for 5, o padrão seria assim:
//*
//**
//***
//****
//*****
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}