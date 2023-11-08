//c. Classe Main:
//
//i. Esta é a classe principal do programa.
//
//ii. Ela deve conter o método main(), onde o fluxo principal do programa será implementado.
//
//1. Dentro do método main() vocêdeve usar os métodos da classe Financiamento.InterfaceUsuario para ler os dados do financiamento.
//
//2. Após ler os dados do financiamento, instancie um objeto do tipo Financiamento.Financiamento para criar este financiamento.

import Financiamento.Financiamento;

public class Main {

    public static void main(String[] args) {

        Financiamento finance1 = new Financiamento(150000, 365, 5);

        System.out.println(finance1.pagamentoMensal());
        System.out.println(finance1.pagamentoTotal());
    }
}
