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
        System.out.println("Escolha um numero");

        int input = scanner.nextInt();
        String drawing = "*";

        for (int i = 1; i <= input; i++) {
            System.out.println(drawing);
            drawing += "*";
        }

    }
}
