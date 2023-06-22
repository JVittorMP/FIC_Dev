package Dia12.Sala.Aluno.View;

import Dia12.Sala.Aluno.Model.Aluno;

public class AlunoControle {
    private Aluno aluno;
    private AlunoVisao alunoVisao;

    public AlunoControle(Aluno aluno, AlunoVisao alunoVisao) {
        this.aluno = aluno;
        this.alunoVisao = alunoVisao;
    }
    
    public void atualizaDadosAluno(String matricula, String nome, int idade){
        aluno.setMatricula(matricula);
        aluno.setNome(nome);
        aluno.setIdade(idade);
        exibirDetalhesAluno();
    }
    
    public void exibirDetalhesAluno() {
        String matricula = aluno.getMatricula();
        String nome = aluno.getNome();
        int idade = aluno.getIdade();
        alunoVisao.exibirDadosAluno(matricula, nome, idade);
    }
}
