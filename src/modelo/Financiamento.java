package modelo;//i. Esta classe representará um financiamento.

public class Financiamento {
    private final double valorImovel;
    private final int prazoFinanciamento;
    private final double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double pagamentoMensal() {
        return (this.valorImovel / this.prazoFinanciamento) * (1 + (this.taxaJurosAnual / 12));
    }

    public double pagamentoTotal() {
        return pagamentoMensal() * prazoFinanciamento;
    }


    public void showDadosFinanciamento() {
        System.out.println("Valor total financiamento: " + pagamentoTotal());
        System.out.println("valor do imovel: " + getValorImovel());
    }
}
