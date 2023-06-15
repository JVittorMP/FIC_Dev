package Dia12.Sala;

import Dia12.Sala.Model.Aluno;
import Dia12.Sala.View.AlunoControle;
import Dia12.Sala.View.AlunoVisao;

public class EscolaMVC {
    public static void main(String[] args) {
        // Modelo
        Aluno aluno = new Aluno("CIA223", "Fernanda Alves", 25);
        
        // Visao
        AlunoVisao alunoVisao = new AlunoVisao();
        
        // Controle
        AlunoControle alunoControle = new AlunoControle(aluno, alunoVisao);
        alunoControle.exibirDetalhesAluno();
        alunoControle.atualizaDadosAluno("CIB261", "Ana Cruz", 23);
    }
}
