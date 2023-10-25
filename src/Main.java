import java.util.Scanner;

//7. Crie um algoritmo em Java que peça ao usuário a temperatura em graus Celsius e converta-a para graus Fahrenheit. Além disso, o programa deve imprimir se está frio (abaixo de 32°F), moderado (entre 32°F e 80°F) ou quente (acima de 80°F).
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma temp em celsius");
        if (scanner.hasNextDouble()) {
            double tempCelsius = scanner.nextInt();
            double tempFahrenheit = 0;

            //Fahrenheit (°F) = (Temperature in degrees Celsius (°C) * 9/5) + 32

            tempFahrenheit = (tempCelsius * 9 / 5) + 32;


            if (tempFahrenheit > 80) {
                System.out.println("Está quente");
            } else if (tempFahrenheit < 32) {
                System.out.println("Está frio");
            } else {
                System.out.println("Está normal");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value for temperature.");
        }
    }
}
