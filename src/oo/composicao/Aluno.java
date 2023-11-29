package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    final List<Curso> cursos = new ArrayList<Curso>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    void addCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso getCursoByName(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome='" + nome + '\'' + '}';
    }
}
