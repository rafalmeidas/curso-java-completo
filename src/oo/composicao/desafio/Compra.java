package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void addItem(int quantidade, Produto p) {
        this.itens.add(new Item(quantidade, p));
    }

    void addItem(String nome, double preco, int quantidade){
        this.itens.add(new Item(quantidade, new Produto(nome, preco)));
    }

    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.produto.preco * item.quantidade;
        }

        return total;
    }
}
