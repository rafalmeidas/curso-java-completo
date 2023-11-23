package colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println("Tamanho é: " + conjunto.size()); // tamanho do conjunto

        conjunto.add("Teste");
        conjunto.add("X");
        System.out.println("Tamanho é: " + conjunto.size()); // tamanho do conjunto

        System.out.println(conjunto.remove("teste")); // retorna boolean
        System.out.println(conjunto.remove("Teste")); // retorna boolean
        System.out.println(conjunto.remove("X")); // retorna boolean

        System.out.println("Tamanho é: " + conjunto.size()); // tamanho do conjunto

        System.out.println(conjunto.contains("x")); // retorna boolean
        System.out.println(conjunto.contains("1")); // retorna boolean
        System.out.println(conjunto.contains(true)); // retorna boolean

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("Nums: " + nums);
        System.out.println("Conjunto: " + conjunto);

        // conjunto.addAll(nums); // União entre 2 conjuntos
        conjunto.retainAll(nums); // União entre 2 conjuntos
        System.out.println("Conjunto: " + conjunto);

        conjunto.clear();
        System.out.println("Conjunto: " + conjunto);
    }
}
