package Dia10.Desafio10.Panels;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public abstract class Panels<T> {

    public abstract T insertPanel();
    public abstract T updatePanel(T object);
    public abstract T selectionPanel();
    public abstract void consultationPanel();

    public static int mainPanel() {
        String msg = "Selecione a Tabela Desejada";
        String ttl = "Seleção de Tabela";
        int msgType = JOptionPane.PLAIN_MESSAGE;
        
        String[] opc = {"Escola", "Aluno", "Sair"};
        int val = JOptionPane.showOptionDialog(null, msg, ttl, 0, msgType, null, opc, opc[0]);
        
        return val;
    }

    public static int operationOption() {
        String msg = "Selecione a Operação Desejada";
        String ttl = "Seleção de Operação";
        int msgType = JOptionPane.PLAIN_MESSAGE;
        
        String[] opc = {"Inserir", "Atualizar", "Deletar", "Consultar"};
        int val = JOptionPane.showOptionDialog(null, msg, ttl, 0, msgType, null, opc, opc[0]);
        
        return val;
    }

    public static void incompatibleDataPanel(){
        String[] opc = {"Continuar"};
        String ttl = "Erro!";
        int msgType = JOptionPane.PLAIN_MESSAGE;
        
        JLabel label = new JLabel("Entrada Incompatível", JLabel.CENTER);
        JOptionPane.showOptionDialog(null, label, ttl, 0, msgType, null, opc, opc[0]);
    }
}
