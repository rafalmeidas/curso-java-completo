package fundamentos.desafios;

import java.util.Scanner;

public class CalcDelta {
    public static void main(String[] args) {
        System.out.println("Calcular delta");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        int a = scanner.nextInt(); // 1

        System.out.println("Digite o valor de b: ");
        int b = scanner.nextInt(); // 12

        System.out.println("Digite o valor de c: ");
        int c = scanner.nextInt(); // -13

        int delta = (b * b) - (4 * a * c);

        System.out.println("O resultado de delta é: " + delta);
    }
}
