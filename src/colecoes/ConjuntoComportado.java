package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
//        Set<String> listaCandidatos = new HashSet<String>();
        SortedSet<String> listaCandidatos = new TreeSet<String>();

        listaCandidatos.add("Ana");
        listaCandidatos.add("Carlos");
        listaCandidatos.add("Luca");
        listaCandidatos.add("Pedro");

//        System.out.println(listaCandidatos);
        for (String candidatos : listaCandidatos) {
            System.out.println(candidatos);
        }
    }
}
