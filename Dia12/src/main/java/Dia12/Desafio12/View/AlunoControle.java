package Dia12.Desafio12.View;

import java.util.List;

import Dia12.Desafio12.Model.Aluno;

public class AlunoControle {
    public void atualizarCoeficiente(int id, double coeficiente){
        Aluno aluno = read(id);
        aluno.setCoeficiente(coeficiente);
        update(aluno);
    }

    public void exibirAluno(Aluno aluno) {
        AlunoVisao.exibirAluno(aluno);
    }
    
    public void exibirMenu() {
        AlunoVisao.menu();
    }

    public void listarAlunos() {
        List<Aluno> alunos = readAll();
        AlunoVisao.listarAlunos(alunos);
    }

    public void create(Aluno objeto){
        AlunoConnection.getConnection().persist(objeto);
    }
    
    public Aluno read(int id){
        return AlunoConnection.getConnection().find(id);
    }
    
    public void update(Aluno objeto){
        AlunoConnection.getConnection().merge(objeto);
    }
    
    public void delete(Aluno objeto){
        AlunoConnection.getConnection().remove(objeto);
    }
    
    public List<Aluno> readAll(){
        return AlunoConnection.getConnection().findAll();
    }

    public void close() {
        AlunoConnection.getConnection().close();
    }
}
