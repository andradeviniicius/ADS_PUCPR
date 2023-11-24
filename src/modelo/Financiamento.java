package modelo;//i. Esta classe representará um financiamento.

public class Financiamento {
    private final double valorImovel;
    private final int prazoFinanciamento;
    private final double taxaJurosAnual;

    // ex input: (500000, 10, 10)
    // vlr imovel = 500.000,00
    // prazo = 10 anos
    // juros = 10%

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
        return (this.valorImovel / (this.prazoFinanciamento * 12) * (1 + ((this.taxaJurosAnual / 100) / 12)));
    }

    public double pagamentoTotal() {
        return pagamentoMensal() * prazoFinanciamento;
    }


    public void showDadosFinanciamento() {
        System.out.println("valor do imovel: " + getValorImovel());
        System.out.println("Valor pagamento mensal: " + pagamentoMensal());
        System.out.println("Valor total financiamento: " + pagamentoTotal());
    }
}
