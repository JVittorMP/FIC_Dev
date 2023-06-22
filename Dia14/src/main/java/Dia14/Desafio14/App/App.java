package Dia14.Desafio14.App;

import Dia14.Desafio14.Model.Aluno;
import Dia14.Desafio14.Model.Prova;
import Dia14.Desafio14.Model.Turma;

public class App {
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getConnection();

        Aluno aluno = new Aluno("Tristan Rubier");
        Turma turma = new Turma("Cálculo 1");
        Prova prova = new Prova();
        prova.setNome("P1: Trigonometria");
        prova.setNota(9.45);
        prova.setAluno(aluno);
        prova.setTurma(turma);

        connection.persist(aluno);
        connection.persist(turma);
        connection.persist(prova);

        Aluno novo = connection.find(Aluno.class, 1);
        Prova nova = new Prova();
        nova.setNome("P2: Cálculo Diferencial");
        nova.setNota(4.85);
        nova.setAluno(aluno);
        nova.setTurma(turma);
        connection.persist(nova);
        connection.update(novo);

        connection.close();
    }
}
