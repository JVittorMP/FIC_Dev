package Dia06.Desafio06;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
    public static Prioridade converterPrioridade(int opc){
        Prioridade prioridade = Prioridade.NENHUM;
        switch(opc) {
            case 0 -> prioridade = Prioridade.BAIXA;
            case 1 -> prioridade = Prioridade.MEDIA;
            case 2 -> prioridade = Prioridade.ALTA;
        }
        return prioridade;
    }

    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();
        boolean parar = false;

        String escolhas[] = {"Adicionar", "Concluir", "Fechar"};
        String prioridades[] = {"Baixa", "Média", "Alta"};
        String opcoes[] = {"Concluir", "Cancelar"};
        
        JComboBox<String> prioridade = new JComboBox<>(prioridades);
        JTextField nome = new JTextField();
        JTextField descricao = new JTextField();
        
        Object[] corpo = {
            "Nome: ", nome,
            "Descricao: ", descricao,
            "Prioridade: ", prioridade
        };
        
        while(!parar){
            int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha a opção desejada: ",
                "Gerenciador de Tarefas",
                JOptionPane.WARNING_MESSAGE,
                0,
                null,
                escolhas,
                escolhas[2]
            );
            
            switch(escolha){
                case 0:
                    int opcao = JOptionPane.showOptionDialog(
                        null,
                        corpo,
                        "Gerenciador de Tarefas",
                        JOptionPane.WARNING_MESSAGE,
                        0,
                        null,
                        opcoes,
                        opcoes[1]
                    );
                    if(opcao == 0){
                        Tarefa novo = new Tarefa(nome.getText(), descricao.getText(), converterPrioridade(prioridade.getSelectedIndex()));
                        gerenciador.incluirTarefa(novo);
                        prioridade.setSelectedIndex(0);
                    }
                    break;
                case 1:
                    String listaTarefas = "";
                    for(var tarefa : gerenciador.getTarefas()){
                        listaTarefas += String.format(tarefa.imprimir() + "%n");
                    }
                    listaTarefas += String.format("%n" + "Digite o ID da tarefa que deseja concluir: ");

                    String resposta = JOptionPane.showInputDialog(null, listaTarefas);
                    if(resposta != null && resposta.matches("[0-9]+")){
                        int respostaInt = Integer.parseInt(resposta);
                        for(var tarefa : gerenciador.getTarefas()){
                            if(tarefa.getIdentificador() == respostaInt){
                                tarefa.setConcluido(true);
                            }
                        }
                    }
                    break;
                case 2:
                    parar = true;
                    break;
            }
            nome.setText("");
            descricao.setText("");
        }
    }
}
