package Financiamento;//i. Esta classe representará um financiamento.

public class Financiamento {
    private final double valorImovel;
    private final int prazoFinanciamento;
    private final double taxaJurosAnual;

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void showDadosFinanciamento() {
        System.out.println("Valor imovel: " + getValorImovel());
        System.out.println("Prazo Financiamento.Financiamento: " + getPrazoFinanciamento());
        System.out.println("Taxa Juros Anual: " + getTaxaJurosAnual());
    }

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }


    public double pagamentoMensal() {
        return (this.valorImovel / this.prazoFinanciamento) * (1 + (this.taxaJurosAnual / 12));

    }

    public double pagamentoTotal() {
        return pagamentoMensal() * prazoFinanciamento;
    }


}
