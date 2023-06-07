package Dia07.Desafio07;

public class Triciclo extends Transporte {
    private String marca;
    private int rodas;

    public Triciclo(String marca, int rodas, int capacidade) {
        super(capacidade);
        this.marca = marca;
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Triciclo(" +
            "Capacidade: " + getCapacidade() + " | " +
            "Marca: " + marca + " | " +
            "Rodas: " + rodas + ")";
    }

    public void transportar(){
        System.out.println("Triciclo Transportando Pesssoas...");
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
