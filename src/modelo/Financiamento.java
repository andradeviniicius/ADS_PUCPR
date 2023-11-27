package modelo;
public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Getters
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Método abstrato para calcular o pagamento mensal
    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12) * (1 + ((this.taxaJurosAnual / 100) / 12)));
    }

    ;

    // Método para calcular o total do pagamento
    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento;
    }

    // Método público para mostrar dados do financiamento
    public void mostrarDadosFinanciamento() {
        System.out.println("Valor do Imóvel: R$ " + valorImovel);
        System.out.println("Prazo do Financiamento: " + prazoFinanciamento + " anos");
        System.out.println("Taxa de Juros Anual: " + taxaJurosAnual + "%");
        System.out.println("Total do Financiamento: R$ " + calcularTotalPagamento());
    }
}
