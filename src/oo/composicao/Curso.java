package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final List<Aluno> alunos = new ArrayList<Aluno>();

    public Curso(String nome) {
        this.nome = nome;
    }

    void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    @Override
    public String toString() {
        return "Curso{" + "nome='" + nome + '\'' + '}';
    }
}
