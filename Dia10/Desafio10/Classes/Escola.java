package Dia10.Desafio10.Classes;

public class Escola {
    private int codigo;
    private String nome;
    private int capacidade;

    public Escola(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public Escola(int codigo, String nome, int capacidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Escola(Codigo: " + codigo + ", Nome: " + nome + ", Capacidade: " + capacidade + ')';
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
