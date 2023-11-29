package oo.composicao;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> items = new ArrayList<Item>();

    void addItem(Item item){
        items.add(item);
    }

    double getValorTotal() {
        double total = 0;

        for (Item item : items) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
