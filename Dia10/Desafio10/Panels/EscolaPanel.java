package Dia10.Desafio10.Panels;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Dia10.Desafio10.Classes.Escola;
import Dia10.Desafio10.Repository.EscolaRepository;
import java.awt.BorderLayout;

public class EscolaPanel extends Panels<Escola> {
    @Override
    public Escola insertPanel(){
        JTextField nome = new JTextField();
        JTextField capacidade = new JTextField();
        
        String ttl = "Cadastro de Escola";
        int msgType = JOptionPane.PLAIN_MESSAGE;
        
        Object[] corpo = {"Nome: ", nome, "Capacidade: ", capacidade};
        String[] casos = {"Concluir", "Cancelar"};
        
        int val = JOptionPane.showOptionDialog(null, corpo, ttl, 0, msgType, null, casos, casos[0]);
        
        if(val == 0)
            if(capacidade.getText().matches("[0-9]+")){
                Escola escola = new Escola(nome.getText(), Integer.parseInt(capacidade.getText()));
                return escola;
            } else {
                Panels.incompatibleDataPanel();
            }
        
        return null;
    }

    @Override
    public Escola updatePanel(Escola escola){
        JTextField nome = new JTextField();
        JTextField capacidade = new JTextField();
        JTextField ID = new JTextField();
        ID.setText(Integer.toString(escola.getCodigo()));
        ID.setEditable(false);
        
        nome.setText(escola.getNome());
        capacidade.setText(Integer.toString(escola.getCapacidade()));
        ID.setText(Integer.toString(escola.getCodigo()));
        
        String ttl = "Atualização de Escola";
        int msgType = JOptionPane.PLAIN_MESSAGE;
        
        Object[] corpo = {"Código: ", ID, "Nome: ", nome, "Capacidade: ", capacidade};
        String[] casos = {"Concluir", "Cancelar"};
        
        int val = JOptionPane.showOptionDialog(null, corpo, ttl, 0, msgType, null, casos, casos[0]);
        
        if(val == 0)
            if(capacidade.getText().matches("[0-9]+")){
                Escola update = new Escola(escola.getCodigo(), nome.getText(), Integer.parseInt(capacidade.getText()));
                return update;
            } else {
                Panels.incompatibleDataPanel();
            }
        
        return null;
    }

    @Override
    public Escola selectionPanel(){
        EscolaRepository er = new EscolaRepository();
        List<Escola> escolas = er.select();

        int msgType = JOptionPane.PLAIN_MESSAGE;
        String[] opc = {"Confirmar", "Cancelar"};

        String msg = "<html>";
        for(var escola : escolas){
            msg += "Codigo: " + escola.getCodigo() + "<br>" + "Nome: " + escola.getNome() + "<br>" + "Capacidade: " + escola.getCapacidade() + "<br><br>";
        }
        msg += "Insira o Código Desejado <br><br><html>";

        JTextField ID = new JTextField();

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel(msg, JLabel.CENTER), BorderLayout.CENTER);
        panel.add(ID, BorderLayout.SOUTH);

        int val = JOptionPane.showOptionDialog(null, panel, "Escolas", 0, msgType, null, opc, opc[0]);
        String codigo = ID.getText();
        if(val == 0)
            if(!codigo.isBlank() && codigo.matches("[0-9]+"))
                return (er.get(Integer.parseInt(codigo)));
            else
                Panels.incompatibleDataPanel();

        return null;
    }

    @Override
    public void consultationPanel(){
        EscolaRepository er = new EscolaRepository();
        List<Escola> escolas = er.select();

        String[] opc = {"Continuar"};
        String ttl = "Escolas";
        int msgType = JOptionPane.PLAIN_MESSAGE;

        String msg = "<html>";
        for(var escola : escolas){
            msg += "Matricula: " + escola.getCodigo() + "<br>" + "Nome: " + escola.getNome() + "<br>" + "Capacidade: " + escola.getCapacidade() + "<br><br>";
        }
        msg += "<html>";
        
        JLabel label = new JLabel(msg, JLabel.CENTER);
        JOptionPane.showOptionDialog(null, label, ttl, 0, msgType, null, opc, opc[0]);
    }
}
