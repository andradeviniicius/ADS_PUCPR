package main;//c. Classe main.Main:
//
//i. Esta é a classe principal do programa.
//
//ii. Ela deve conter o método main(), onde o fluxo principal do programa será implementado.
//
//1. Dentro do método main() vocêdeve usar os métodos da classe Financiamento.InterfaceUsuario para ler os dados do financiamento.
//
//2. Após ler os dados do financiamento, instancie um objeto do tipo Financiamento.Financiamento para criar este financiamento.

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario user1 = new InterfaceUsuario();

        int valorImovel = user1.valorImovel();
        int valorJurosAnual = user1.valorJurosAnual();
        int prazoFinanciamento = user1.prazoFinanciamento();

        Financiamento finance1 = new Financiamento(valorImovel, prazoFinanciamento, valorJurosAnual);

        finance1.showDadosFinanciamento();
    }
}
