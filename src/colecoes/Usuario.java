package colecoes;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Usuario{" + "nome='" + nome + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
