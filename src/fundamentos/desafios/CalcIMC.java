package fundamentos.desafios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double weight = scanner.nextDouble();

        System.out.println("Digite sua altura:");
        double height = scanner.nextDouble();

        double bruteImc = weight / Math.pow(height, 2);

        BigDecimal bigDecimalImc = BigDecimal.valueOf(bruteImc);
        BigDecimal roundedValue = bigDecimalImc.setScale(2, RoundingMode.HALF_UP);

        double imc = roundedValue.doubleValue();

        System.out.println("Seu IMC é de : " + imc);
    }
}
