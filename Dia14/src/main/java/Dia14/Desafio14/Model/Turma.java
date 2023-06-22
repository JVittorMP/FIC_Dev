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
@Entity @Table(name = "turma")
public class Turma {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private String nome;

    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL)
    private List<Prova> provas;

    public Turma(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-40s", codigo, nome); 
    }
}
