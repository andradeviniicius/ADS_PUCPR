package modelo;

import java.io.Serializable;

public class Apartamento extends Financiamento implements Serializable {
    private int numeroVagasGaragem;
    private int numeroAndar;

    // Construtor
    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual,
                       int numeroVagasGaragem, int numeroAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numeroVagasGaragem = numeroVagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    // Sobrescrever o método calcularPagamentoMensal para utilizar o sistema de amortização PRICE
    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = (Math.pow(1 + (getTaxaJurosAnual() / 12), (getPrazoFinanciamento() * 12)) * (getTaxaJurosAnual() / 12))
                / (Math.pow(1 + (getTaxaJurosAnual() / 12), (getPrazoFinanciamento() * 12)) - 1);

        return getValorImovel() * taxaMensal;
    }
}