package Dia04.Sala;

import javax.swing.JOptionPane;

public class CadastroAlunos {
    public static void main(String[] args) {
        // Criando o array para armazenar os dados dos alunos
        String[][] alunos = new String[50][3];
        
        // Variável para controle da quantidade de alunos cadastrados
        int qtddAlunos = 0;
        
        // Laço para cadastro de múltiplos usuários
        while(true){
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ", "Nome", JOptionPane.WARNING_MESSAGE);
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno: ", "Idade", JOptionPane.QUESTION_MESSAGE));
            double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do aluno: ", "Nota", JOptionPane.ERROR_MESSAGE));
            
            // Armazenando os dados do aluno no Array;
            alunos[qtddAlunos][0] = nome;
            alunos[qtddAlunos][1] = Integer.toString(idade);
            alunos[qtddAlunos][2] = Double.toString(nota);
            qtddAlunos++;
            
            // Verificando se o usuário deseja cadastrar outros alunos
            int opcao = JOptionPane.showConfirmDialog(null, "Cadastrar outro aluno?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if(opcao != JOptionPane.YES_OPTION)
                break;
        }
        
        // Exibindo os dados dos alunos cadastrados
        String listaAlunos = "Lista de Alunos: \n";
        double totalNotas = 0.0;
        for(int i = 0; i < qtddAlunos; i++){
            listaAlunos += alunos[i][0] + " - " + alunos[i][1] + " anos - Nota: " + alunos[i][2] + "\n";
            totalNotas += Double.parseDouble(alunos[i][2]);
        }
        double mediaNotas = totalNotas / qtddAlunos;
        listaAlunos += "\nMedia das notas: " + mediaNotas;
        JOptionPane.showMessageDialog(null, listaAlunos);
    }
}
