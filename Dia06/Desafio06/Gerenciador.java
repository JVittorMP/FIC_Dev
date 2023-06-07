package Dia06.Desafio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Gerenciador {
    private List<Tarefa> tarefas = new ArrayList<>();
    private Incrementador ID = new Incrementador();


    public List<Tarefa> getTarefas() {
        return this.tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void incluirTarefa(Tarefa tarefa) {
        tarefa.setIdentificador(this.ID.getNextValue());
        this.tarefas.add(tarefa);
        Collections.sort(this.tarefas);
    }

    public void concluirTarefa(int ID) {
        if(ID < 0 || ID > this.ID.getIdentifier()){
            JOptionPane.showMessageDialog(null, "Entrada Inválida!");
            return;
        }
        for(var tarefa : this.tarefas){
            if(tarefa.getIdentificador() == ID){
                tarefa.setConcluido(true);
                break;
            }
        }    
    }

    public void exibirTarefas() {
        for(Tarefa tarefa : this.tarefas){
            
        }
    }
}
