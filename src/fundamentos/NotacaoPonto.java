package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhor")
                .toUpperCase()
                .concat("!!!");

        System.out.println(s);

        System.out.println("Rafael".toUpperCase());

        // Tipos primitivos não tem o operador "."
        int a = 7;
        System.out.println(a);
    }
}
