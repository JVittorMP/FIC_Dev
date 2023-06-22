package Dia11.Desafio11;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private double coeficiente;

    public Aluno() {}
    
    public Aluno(String nome, double coeficiente) {
        this.nome = nome;
        this.coeficiente = coeficiente;
    }

    public Aluno(int id, String nome, double coeficiente) {
        this.id = id;
        this.nome = nome;
        this.coeficiente = coeficiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }
}
