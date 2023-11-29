package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "John  Doe";
        compra1.addItem(new Item("Caneta", 20, 7.45));
        compra1.addItem(new Item("Borracha", 12, 3.89));
        compra1.addItem(new Item("Carderno", 3, 18.79));

        System.out.println(compra1.items.size());
        System.out.println(compra1.getValorTotal());
    }
}