package util;

import java.util.Scanner;

public class InterfaceUsuario {

    //1. Pedir ao usuário o valor do imóvel: Ela deve conter um método o qual pede ao usuário para que digite o valor do imóvel, e retorne o valor digitado pelo usuário.
    public int valorImovel() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("valor do imovel?");

        return scanner.nextInt();
    }

    //2. Pedir ao usuário o prazo do financiamento: Ela deve conter um método o qual pede ao usuário para que digite o prazo do financiamento em anos, e retorne o valor digitado pelo usuário.
    public int valorFinanciamento() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("valor financiamento?");

        return scanner.nextInt();
    }


    //3. Pedir ao usuário a taxa de juros: Ela deve conter um método o qual pede ao usuário para que digite a taxa de juros anual, e retorne o valor digitado pelo usuário.
    public int valorJurosAnual() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("valor juros anual?");

        return scanner.nextInt();
    }

}
