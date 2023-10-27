public class Circulo {
    // Atributos da classe
    private double raio;

    // Constante PI definida como final static
    final static double PI = 3.141592653589793;

    // Método construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular o perímetro (ou circunferência) do círculo
    public double calcularPerimetro() {
        return 2 * PI * this.raio;
    }

    // Método principal
    public static void main(String[] args) {
        // Criação de uma instância de Circulo com raio 5
        Circulo meuCirculo = new Circulo(5);

        // Cálculo e impressão do perímetro
        double perimetro = meuCirculo.calcularPerimetro();
        System.out.println("O perímetro do círculo é: " + perimetro);
    }
}
