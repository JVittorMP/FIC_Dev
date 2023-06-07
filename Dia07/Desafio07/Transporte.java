package Dia07.Desafio07;

public abstract class Transporte {
    private int capacidade;

    public Transporte(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void transportar();

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
