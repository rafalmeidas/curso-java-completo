package fundamentos.desafios;

import java.util.Scanner;

public class ToCelsius {
    public static void main(String[] args) {
        final double MULTIPLIER = 5 / 9.0;
        final int ADJUSTMENT = 32;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - ADJUSTMENT) * MULTIPLIER;

        System.out.println(fahrenheit+"°F é igual a " +celsius+ "°C");
    }
}
