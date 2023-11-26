package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        // put inclui e altera, quando o id já existe
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafael");
        usuarios.put(4, "Carlos");

        System.out.println(usuarios + "\n");

        System.out.println("size: " + usuarios.size());
        System.out.println("isEmpty: " + usuarios.isEmpty() + "\n");

        System.out.println("keySet: " + usuarios.keySet());
        System.out.println("values: " + usuarios.values());
        System.out.println("entrySet: " + usuarios.entrySet() + "\n");

        System.out.println("containsKey: " + usuarios.containsKey(20));
        System.out.println("containsKey: " + usuarios.containsValue("Rafael")+ "\n");

        System.out.println(usuarios.get(1));
        System.out.println(usuarios.remove(1));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.print(registro.getKey() + " ====> ");
            System.out.println(registro.getValue());
        }
    }
}
