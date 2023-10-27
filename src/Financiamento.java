//i. Esta classe representará um financiamento.

public class Financiamento {
    //ii. Ela deve conter três atributos: valorImovel (double), prazoFinanciamento (int) e taxaJurosAnual (double).
    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }


    //iii. Deve conter pelo menos três métodos: um construtor para inicializar esses atributos, um método para calcular o pagamento mensal, e outro método para calcular o total do pagamento.
    //iv. As fórmulas para calcular o pagamento mensal e total do pagamento serão:


    public double pagamentoMensal() {
        //1. Pagamento mensal = (valor do imóvel / prazo do financiamento) * (1 + (taxa anual / 12))
        return (this.valorImovel / this.prazoFinanciamento) * (1 + (this.taxaJurosAnual / 12));

    }

    public double pagamentoTotal() {
        //2. Total do pagamento = pagamento mensal * prazo do financiamento
        return pagamentoMensal() * prazoFinanciamento;
    }
}
