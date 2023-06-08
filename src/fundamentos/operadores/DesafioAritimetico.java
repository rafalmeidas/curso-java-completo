package fundamentos.operadores;

public class DesafioAritimetico {
    public static void main(String[] args) {
        challenge();
        challengeRefactor();
    }

    static void challenge() {
        int part1 = (int) Math.pow(6 * (3 + 2), 2) / (3 * 2);
        int part2 = (int) Math.pow((((1 - 5) * (2 - 7)) / 2), 2);

        int result = (int) (Math.pow(part1 - part2, 3) / Math.pow(10, 3));

        System.out.println("\nÍnicio exemplo 1\n");
        System.out.println("O resultado de part1 é: " + part1);
        System.out.println("O resultado de part2 é: " + part2);
        System.out.println("O resultado é: " + result);
        System.out.println("\nFim\n");
    }

    static void challengeRefactor() {
        int numA = (int) Math.pow(6 * (3 + 2), 2);
        int denA = 3 * 2;

        int numB = (1 - 5) * (2 - 7);
        int denB = 2;

        double sup1 = numA / denA;
        double sup2 = Math.pow(numB / denB, 2);

        System.out.println(sup1);
        System.out.println(sup2);

        double sup = Math.pow(sup1 - sup2, 3);
        double inf = Math.pow(10, 3);

        double result = sup / inf;

        System.out.println(result);
    }

}
