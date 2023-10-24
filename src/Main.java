public class Main {

    public static void main(String[] args) {

        // declaração das variáveis
        int x, y;
        int X;     //X maiúsculo é diferente de x minúsculo.
        boolean p, q;
        float a = 10.5f;
        /*

        Aqui atribuímos valores às variáveis que criamos anteriormente.

        Perceba que todas as linhas terminam com ponto e vírgula.

         */

        x = 10;
        y = x - 38;
        X = 9 % 2;
        p = (3 >= 5);
        q = (true || false);

        /*
        Aqui mostramos uma sequência de mensagens na tela.
         */
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("X = " + X);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.printf("a = %.2f", a * 3);
    }
}