package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos numéricos
        byte anosDeEmpresa = 32;
        short numerosDeVoos = 542;
        int id = 89898;
        long pontosAcumulados = 3_121_214_887L;

        // Tipos numéricos reais
        float salario = 11_454.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numerosDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? "+ estaDeFerias);
        System.out.println("Status: "+ status);
    }
}
