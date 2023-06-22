package Dia14.Desafio14.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity @Table(name = "prova")
public class Prova {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private double nota;

    @ManyToOne
    @JoinColumn(name = "Codigo_Aluno")
    private Aluno aluno;
    
    @ManyToOne
    @JoinColumn(name = "Codigo_Turma")
    private Turma turma;

    @Override
    public String toString() {
        return String.format("%-10s %-4s", codigo, nota); 
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
