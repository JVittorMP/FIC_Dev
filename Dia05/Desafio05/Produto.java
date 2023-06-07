package Dia05.Desafio05;

public class Produto {
    private String nome;
    private double valor;
    
    Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto(" + "Nome: " + this.nome + ", Valor: " + this.valor + ")";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
