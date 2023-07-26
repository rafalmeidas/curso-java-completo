package fundamentos.desafios;

import java.util.Scanner;

public class ToCubedAndSquared {
    public static void main(String[] args) {
        System.out.println("Calcular resultado ao quadrado e ao cubo de um valor");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor:");
        double value = scanner.nextDouble();

        System.out.println("O valor digitado para o calculo foi: " + value);
        System.out.println("Resultado ao quadrado: " + Math.pow(value, 2));
        System.out.println("Resultado ao cubo: " + Math.pow(value, 3));
    }
}
