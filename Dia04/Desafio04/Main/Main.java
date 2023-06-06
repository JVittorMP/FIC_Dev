package Dia04.Desafio04.Main;

import javax.swing.JOptionPane;

import Dia04.Desafio04.Classes.Sequence;

public class Main {
    public static void main(String[] args) {
        String listagem = String.format("1: Termo Geral da PA %n" + "2: Soma da PA %n" + "3: Termo Geral da PG %n" + "4: Soma da PG %n%n");
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, listagem, "Insira uma das Opções", JOptionPane.PLAIN_MESSAGE));
        double in = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor Inicial", "Inicio", JOptionPane.PLAIN_MESSAGE));
        double rz = Double.parseDouble(JOptionPane.showInputDialog(null, "Razão", "Razão", JOptionPane.PLAIN_MESSAGE));
        int tm = Integer.parseInt(JOptionPane.showInputDialog(null, "Termo", "Termos", JOptionPane.PLAIN_MESSAGE));
        
        Sequence sq = new Sequence(in, rz);

        switch(op){
            case 1 -> sq.generalArithmeticTerm(tm);
            case 2 -> sq.arithmeticProgressionSum(tm);
            case 3 -> sq.generalGeometricTerm(tm);
            case 4 -> sq.geometricProgressionSum(tm);
        }
    }
}
