package fundamentos.desafios;

import java.util.Scanner;

public class ToFahrenheit {
    public static void main(String[] args) {
        final double ADJUSTMENT = 9.0 / 5;
        final int ADDITION = 32;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * ADJUSTMENT) + ADDITION;

        System.out.println(celsius+"°C é igual a " +fahrenheit+ "°F");
    }
}
