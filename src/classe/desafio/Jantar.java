package classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida c1= new Comida("Arroz", 0.180);
        Comida c2 = new Comida("Carne", 0.300);

        Pessoa p1 = new Pessoa("John Doe", 99.8);

        System.out.println(p1.apresentar());

        p1.comer(c1);
        System.out.println(p1.apresentar());

        p1.comer(c2);
        System.out.println(p1.apresentar());
    }
}
