// Classe Main (pacote main)
package main;

import modelo.Casa;
import modelo.Apartamento;
import modelo.Terreno;
import modelo.Financiamento;
import util.InterfaceUsuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> financiamentos = new ArrayList<>();

        // Adiciona financiamentos à lista
        financiamentos.add(criarFinanciamento(interfaceUsuario, Casa.class));

        // Mostra informações dos financiamentos
        mostrarInformacoesFinanciamentos(financiamentos);

        // Salva os financiamentos em um arquivo
        salvarFinanciamentosEmArquivo("financiamentos.txt", financiamentos);

        // Lê os financiamentos do arquivo
        List<Financiamento> financiamentosLidos = lerFinanciamentosDeArquivo("financiamentos.txt");

        // Mostra informações dos financiamentos lidos do arquivo
        mostrarInformacoesFinanciamentos(financiamentosLidos);
    }

    private static Financiamento criarFinanciamento(InterfaceUsuario interfaceUsuario, Class<?> tipoFinanciamento) {
        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJuros = interfaceUsuario.pedirTaxaJuros();

        if (tipoFinanciamento == Casa.class) {
            double tamanhoAreaConstruida = interfaceUsuario.pedirTamanhoAreaConstruida();
            double tamanhoTerreno = interfaceUsuario.pedirTamanhoTerreno();

            return new Casa(valorImovel, prazoFinanciamento, taxaJuros, tamanhoAreaConstruida, tamanhoTerreno);
        } else if (tipoFinanciamento == Apartamento.class) {
            int numeroVagasGaragem = interfaceUsuario.pedirNumeroVagasGaragem();
            int numeroAndar = interfaceUsuario.pedirNumeroAndar();

            return new Apartamento(valorImovel, prazoFinanciamento, taxaJuros, numeroVagasGaragem, numeroAndar);
        } else if (tipoFinanciamento == Terreno.class) {
            String tipoZona = interfaceUsuario.pedirTipoZona();

            return new Terreno(valorImovel, prazoFinanciamento, taxaJuros, tipoZona);
        } else {
            throw new IllegalArgumentException("Tipo de financiamento não reconhecido.");
        }
    }

    private static void mostrarInformacoesFinanciamentos(List<Financiamento> financiamentos) {
        System.out.println("\nInformações dos Financiamentos:");
        for (Financiamento financiamento : financiamentos) {
            financiamento.mostrarDadosFinanciamento();
            System.out.println();
        }
    }

    private static void salvarFinanciamentosEmArquivo(String nomeArquivo, List<Financiamento> financiamentos) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(financiamentos);
            System.out.println("\nFinanciamentos salvos com sucesso no arquivo " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os financiamentos no arquivo " + nomeArquivo);
            e.printStackTrace();
        }
    }

    private static List<Financiamento> lerFinanciamentosDeArquivo(String nomeArquivo) {
        List<Financiamento> financiamentos = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            financiamentos = (List<Financiamento>) inputStream.readObject();
            System.out.println("\nFinanciamentos lidos com sucesso do arquivo " + nomeArquivo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler os financiamentos do arquivo " + nomeArquivo);
            e.printStackTrace();
        }

        return financiamentos;
    }
}
