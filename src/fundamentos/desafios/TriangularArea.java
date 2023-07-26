package fundamentos.desafios;

import java.util.Scanner;

public class TriangularArea {
    public static void main(String[] args) {
        System.out.println("Calcular a área de um triângulo");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do triângulo");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do triângulo");
        double height = scanner.nextDouble();

        double result = (base * height) / 2;

        System.out.println("A área do triângulo é igual á: " + result);
    }
}
