public class Retangulo {

    float altura;
    float largura;

    public Retangulo(float alt, float lar) {
        altura = alt;
        largura = lar;
    }

    float calcularPerimetro() {
        float perimetro;
        perimetro = 2 * altura + 2 * largura;
        return perimetro;
    }

    void imprimirDados() {
        float p;                   // variável local
        p = calcularPerimetro();   // calcula o perímetro do retângulo
        System.out.println("Retângulo: ");
        System.out.println("- altura:    " + altura);
        System.out.println("- largura:   " + largura);
        System.out.println("- perimetro: " + p);
    }
}
