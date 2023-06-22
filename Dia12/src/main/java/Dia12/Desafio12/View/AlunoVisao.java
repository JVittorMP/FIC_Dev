package Dia12.Desafio12.View;

import java.util.List;

import Dia12.Desafio12.Model.Aluno;

public class AlunoVisao {
    public static void exibirAluno(Aluno aluno){
        System.out.println();
        System.out.println("ID: " + aluno.getId());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Coeficiente: " + aluno.getCoeficiente());
        System.out.println();
    }

    public static void listarAlunos(List<Aluno> alunos) {
        System.out.println(String.format("%s %-40s %s", "ID", "Nome", "Coeficiente"));
        for(Aluno item : alunos){
            System.out.println(String.format("%-2s %-40s %s", item.getId(), item.getNome(), item.getCoeficiente()));
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("1: Inserir");
        System.out.println("2: Atualizar");
        System.out.println("3: Deletar");
        System.out.println("4: Listar");
        System.out.println("5: Atualizar Coeficiente");
        System.out.println("0: Sair");
        System.out.println();
    }
}
