package fundamentos;

public class DesafioTemperatura {
    public static void main(String[] args) {
        final double MULTIPLIER = 5 / 9.0;
        final int ADJUSTMENT = 32;
        double fahrenheit = 86;
        double celsius = (fahrenheit - ADJUSTMENT) * MULTIPLIER;

        System.out.println(fahrenheit+"ºF = "+ celsius+"ºC");
    }
}
