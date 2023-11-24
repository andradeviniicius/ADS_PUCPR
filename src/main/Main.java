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

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Financiamento> financiamentos = new ArrayList<Financiamento>(); // Create an ArrayList object


        InterfaceUsuario user1 = new InterfaceUsuario();

        int valorImovel1 = user1.valorImovel();
        int valorJurosAnual1 = user1.valorJurosAnual();
        int prazoFinanciamento1 = user1.prazoFinanciamento();

        Financiamento finance1 = new Financiamento(valorImovel1, prazoFinanciamento1, valorJurosAnual1);


        System.out.println("Financiamento 1 = ");
        finance1.showDadosFinanciamento();

    }
}
