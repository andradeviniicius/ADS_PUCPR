// Classe Casa (na pasta modelo)
package modelo;

import java.io.Serializable;

public class Casa extends Financiamento implements Serializable {
    private double tamanhoAreaConstruida;
    private double tamanhoTerreno;

    // Construtor
    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual,
                double tamanhoAreaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tamanhoAreaConstruida = tamanhoAreaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    // Sobrescrever o método calcularPagamentoMensal para incluir o valor do seguro obrigatório
    @Override
    public double calcularPagamentoMensal() {
        return this.getValorImovel() / (this.getPrazoFinanciamento() * 12) + 80;
    }
}
