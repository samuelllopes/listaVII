import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double tempFahrenheit = leia.nextDouble();

        double tempCelsius = (tempFahrenheit - 32) / 1.8;

        System.out.println("A temperatura em graus Celsius é: " + tempCelsius);
    }
}
