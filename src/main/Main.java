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

        InterfaceUsuario user2 = new InterfaceUsuario();

        int valorImovel2 = user2.valorImovel();
        int valorJurosAnual2 = user2.valorJurosAnual();
        int prazoFinanciamento2 = user2.prazoFinanciamento();

        Financiamento finance2 = new Financiamento(valorImovel2, prazoFinanciamento2, valorJurosAnual2);

        InterfaceUsuario user3 = new InterfaceUsuario();

        int valorImovel3 = user3.valorImovel();
        int valorJurosAnual3 = user3.valorJurosAnual();
        int prazoFinanciamento3 = user3.prazoFinanciamento();

        Financiamento finance3 = new Financiamento(valorImovel3, prazoFinanciamento3, valorJurosAnual3);


        InterfaceUsuario user4 = new InterfaceUsuario();

        int valorImovel4 = user4.valorImovel();
        int valorJurosAnual4 = user4.valorJurosAnual();
        int prazoFinanciamento4 = user4.prazoFinanciamento();

        Financiamento finance4 = new Financiamento(valorImovel4, prazoFinanciamento4, valorJurosAnual4);

        System.out.println("Financiamento 1 = ");
        finance1.showDadosFinanciamento();

        System.out.println("Financiamento 2 = ");
        finance2.showDadosFinanciamento();

        System.out.println("Financiamento 3 = ");
        finance3.showDadosFinanciamento();

        System.out.println("Financiamento 4 = ");
        finance4.showDadosFinanciamento();



    }
}
