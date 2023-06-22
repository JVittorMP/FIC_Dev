package Dia14.Desafio14.Model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity @Table(name = "aluno")
public class Aluno {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricula;
    private String nome;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Prova> provas;

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-40s", matricula, nome); 
    }

    public List<Prova> getProvas() {
        return provas;
    }
}
