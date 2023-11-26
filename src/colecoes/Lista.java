package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // acessar pelo índice

        System.out.println(lista.remove(1)); // remover pelo indice retorna o objeto
        System.out.println(lista.remove(new Usuario("Manu"))); // remover pelo indice retorna o boolean

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
