public class Main {

    public static void main(String[] args) {
        Retangulo rect1;
        rect1 = new Retangulo(10, 20);

        Retangulo rect2;
        rect2 = new Retangulo(50, 20);

        System.out.println("Mundo dos retangulos");
        System.out.println("rect1");
        rect1.imprimirDados();
        System.out.println("-");
        System.out.println("Mundo dos retangulos");
        System.out.println("rect2");
        rect2.imprimirDados();
        System.out.println("-");
    }
}
