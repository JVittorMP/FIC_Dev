package Dia04.Desafio04.Classes;

import javax.swing.JOptionPane;

public class Sequence {
    private double inicial;
    private double razao;

    public Sequence(double in, double r){
        this.inicial = in;
        this.razao = r;
    }

    // Cálculo do Termo Geral N da PA
    public void generalArithmeticTerm(int n){
        double termo = this.inicial;
        
        for(int i = 1; i < n; i++){
            termo += this.razao;
        }
        
        String mssg = Integer.toString(n) + "° Termo: " + Double.toString(termo);
        JOptionPane.showMessageDialog(null, mssg, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }

    // Cálculo da Soma dos N Primeiros Termos da PA
    public void arithmeticProgressionSum(int n){
        double sum = 0.0, fin = 0.0;
        
        for(int i = 1; i < n; i++){
            fin += this.razao;
        }
        
        sum = n * (this.inicial + fin) / 2;
        
        String mssg = "Soma: " + Double.toString(sum);
        JOptionPane.showMessageDialog(null, mssg, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }

    // Cálculo do Termo Geral N da PG
    public void generalGeometricTerm(int n){
        double termo = this.inicial;
        
        for(int i = 1; i < n; i++){
            termo *= this.razao;
        }
        
        String mssg = Integer.toString(n) + "° Termo: " + Double.toString(termo);
        JOptionPane.showMessageDialog(null, mssg, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }

    // Cálculo da Soma dos N Primeiros Termos da PA
    public void geometricProgressionSum(int n){
        double sum = 0.0, fin = 1.0;
        
        for(int i = 0; i < n; i++){
            fin *= this.razao;
        }
        
        sum = this.inicial * (fin - 1) / (razao - 1);
        
        String mssg = "Soma: " + Double.toString(sum);
        JOptionPane.showMessageDialog(null, mssg, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
