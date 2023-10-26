import java.util.Scanner;

//9. Crie um algoritmo em Java que solicita ao usuário para que insira um número inteiro entre 1 e 1000 e converta-o em um número romano. Por exemplo, se o usuário inserir 58, o programa deve imprimir "LVIII".
//*
//**
//***
//****
//*****
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int input = scanner.nextInt();
        String valorRomano = "";
        int valorNumerico = input;

        

        String[][] romanos = {
                {"M", "1000"},
                {"CM", "900"},
                {"D", "500"},
                {"CD", "400"},
                {"C", "100"},
                {"XC", "90"},
                {"L", "50"},
                {"XL", "40"},
                {"X", "10"},
                {"IX", "9"},
                {"V", "5"},
                {"IV", "4"},
                {"I", "1"}
        };

        //150

        for (int i = 0; i <= romanos.length - 1; i++) {
            if (valorNumerico >= Integer.parseInt(romanos[i][1])) {
                valorNumerico -= Integer.parseInt(romanos[i][1]);
                valorRomano += romanos[i][0];
            }
        }

        System.out.println(valorNumerico);
        System.out.println(valorRomano);

    }
}