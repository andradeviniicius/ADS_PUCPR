public class Calculadora {
    public static double sqrt(double valor) {
        return Math.sqrt(valor);
    }

    public static double log(double valor) {
        return Math.log(valor);
    }

    public static void main(String[] args) {
        int x = 25;
        int y = 100;

        double raiz = Calculadora.sqrt(x);
        double logaritmo = Calculadora.log(y);

        System.out.printf("Raiz quadrada de %d: %f \n", x, raiz);
        System.out.printf("Logaritmo de %d: %f \n", y, logaritmo);

//        A palavra-chave static significa que esses métodos pertencem à classe Calculadora
//        em si, não à uma instância específica (ou objeto) da classe. Em outras palavras,
//        não precisamos criar um objeto Calculadora para usar esses métodos – podemos simplesmente chamá-los
//        diretamente na classe. Percebe que não temos nenhuma instanciação de objetos de Calculadora nesse código?
    }
}
