package fundamentos.operadores;

public class DesafioLogico {
    public static void main(String[] args) {
        boolean work1 = false;
        boolean work2 = true;

        boolean buy50Tv = work1 && work2;
        boolean buy32Tv = work1 ^ work2;
        boolean buyIceCream = work1 || work2;

        System.out.println("Comprou TV 50\"? " + (buy50Tv ? "Sim" : "Não"));
        System.out.println("Comprou TV 32\"? " + (buy32Tv ? "Sim" : "Não"));
        System.out.println("Comprou Sorvete? " + (buyIceCream ? "Sim" : "Não"));

        System.out.println("Mais saudável? " + (!buyIceCream ? "Sim" : "Não"));
    }
}
