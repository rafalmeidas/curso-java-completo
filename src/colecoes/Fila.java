package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Retornam o próximo elemento da fila sem remover
        System.out.println(fila.peek()); // retorna null se a fila estiver vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança exceção se a fila estiver vazia
        System.out.println(fila.element());
        System.out.println("\n");

        // Retorna o elemento da fila e remove
        System.out.println("Limpando a fila:");
        System.out.println(fila.poll()); // retorna null se a fila estiver vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // lança exceção se a fial estiver vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
