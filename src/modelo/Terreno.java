package modelo;

import java.io.Serializable;

public class Terreno extends Financiamento implements Serializable {
    private String tipoZona;

    // Construtor
    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual,
                   String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    // Sobrescrever o método calcularPagamentoMensal para incluir o acréscimo por risco de inadimplência
    @Override
    public double calcularPagamentoMensal() {
        return calcularPagamentoMensal() * 1.02;
    }
}
