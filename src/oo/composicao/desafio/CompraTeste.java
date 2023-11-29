package oo.composicao.desafio;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.addItem("Caneta", 1, 100);
        compra1.addItem(2, new Produto("Notebook", 2000));

        Compra compra2 = new Compra();
        compra2.addItem("Caderno", 10, 10);
        compra2.addItem(1, new Produto("Impressora", 1000));

        Cliente c1 = new Cliente("John Doe");
        c1.addCompra(compra1);
        c1.addCompra(compra2);

        System.out.println(c1.getValorTotal());
    }
}
