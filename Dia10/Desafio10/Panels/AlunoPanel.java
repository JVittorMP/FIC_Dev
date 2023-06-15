package Dia10.Desafio10.Panels;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Dia10.Desafio10.Classes.Aluno;
import Dia10.Desafio10.Repository.AlunoRepository;
import java.awt.BorderLayout;

public class AlunoPanel extends Panels<Aluno> {
    @Override
    public Aluno insertPanel(){
        JTextField nome = new JTextField();
        JTextField email = new JTextField();
        JTextField idade = new JTextField();
        
        String ttl = "Cadastro de Aluno";
        int msgType = JOptionPane.PLAIN_MESSAGE;
        
        Object[] corpo = {"Nome: ", nome, "Email: ", email, "Idade: ", idade};
        String[] casos = {"Concluir", "Cancelar"};
        
        int val = JOptionPane.showOptionDialog(null, corpo, ttl, 0, msgType, null, casos, casos[0]);
        
        if(val == 0)
            if(idade.getText().matches("[0-9]+")){
                Aluno aluno = new Aluno(nome.getText(), email.getText(), Integer.parseInt(idade.getText()));
                return aluno;
            } else {
                Panels.incompatibleDataPanel();
            }
        
        return null;
    }

    @Override
    public Aluno updatePanel(Aluno aluno){
        JTextField nome = new JTextField();
        JTextField email = new JTextField();
        JTextField idade = new JTextField();
        JTextField ID = new JTextField();
        ID.setEditable(false);
        
        nome.setText(aluno.getNome());
        email.setText(aluno.getEmail());
        idade.setText(Integer.toString(aluno.getIdade()));
        ID.setText(Integer.toString(aluno.getMatricula()));
        
        String ttl = "Atualização de Aluno";
        int msgType = JOptionPane.PLAIN_MESSAGE;
        
        Object[] corpo = {"Matricula: ", ID, "Nome: ", nome, "Email: ", email, "Idade: ", idade};
        String[] casos = {"Concluir", "Cancelar"};
        
        int val = JOptionPane.showOptionDialog(null, corpo, ttl, 0, msgType, null, casos, casos[0]);
        
        if(val == 0)
            if(idade.getText().matches("[0-9]+")){
                Aluno update = new Aluno(aluno.getMatricula(), nome.getText(), email.getText(), Integer.parseInt(idade.getText()));
                return update;
            } else {
                Panels.incompatibleDataPanel();
            }
        
        return null;
    }

    @Override
    public Aluno selectionPanel(){
        AlunoRepository ar = new AlunoRepository();
        List<Aluno> alunos = ar.select();

        int msgType = JOptionPane.PLAIN_MESSAGE;
        String[] opc = {"Confirmar", "Cancelar"};
        
        String msg = "<html>";
        for(var aluno : alunos){
            msg += "Matricula: " + aluno.getMatricula() + "<br>" + "Nome: " + aluno.getNome() + "<br><br>";
        }
        msg += "Insira a Matrícula Desejada <br><br><html>";

        JTextField ID = new JTextField();

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel(msg, JLabel.CENTER),  BorderLayout.CENTER);
        panel.add(ID, BorderLayout.SOUTH);

        int val = JOptionPane.showOptionDialog(null, panel, "Alunos", 0, msgType, null, opc, opc[0]);
        String matricula = ID.getText();

        if(val == 0)
            if(!matricula.isBlank() && matricula.matches("[0-9]+"))
                return (ar.get(Integer.parseInt(matricula)));
            else
                Panels.incompatibleDataPanel();

        return null;
    }

    @Override
    public void consultationPanel(){
        AlunoRepository ar = new AlunoRepository();
        List<Aluno> alunos = ar.select();

        String[] opc = {"Continuar"};
        String ttl = "Alunos";
        int msgType = JOptionPane.PLAIN_MESSAGE;

        String msg = "<html>";
        for(var aluno : alunos){
            msg += "Matricula: " + aluno.getMatricula() + "<br>" + "Nome: " + aluno.getNome() + "<br>";
            msg += "Email: " + aluno.getEmail() + "<br>" + "Idade: " + aluno.getIdade() + "<br><br>";
        }
        msg += "<html>";
        
        JLabel label = new JLabel(msg, JLabel.CENTER);
        JOptionPane.showOptionDialog(null, label, ttl, 0, msgType, null, opc, opc[0]);
    }
}
