package colecoes;

public class Usuario {
    String nome;

    public String getNome() {
        return nome;
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
