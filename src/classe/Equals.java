package classe;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Jonh Doe";
        u1.email = "john.doe@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Jonh Doe";
        u2.email = "john.doe@email.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
