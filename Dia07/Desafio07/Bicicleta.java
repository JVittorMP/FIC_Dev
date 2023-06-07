package Dia07.Desafio07;

public class Bicicleta extends Transporte {
    private String marca;
    private int rodas;

    public Bicicleta(String marca, int rodas, int capacidade) {
        super(capacidade);
        this.marca = marca;
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Bicicleta(" +
            "Capacidade: " + getCapacidade() + " | " +
            "Marca: " + marca + " | " +
            "Rodas: " + rodas + ")";
    }

    public void transportar(){
        System.out.println("Bicicleta Transportando Pessoas e Cargas...");
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRodas() {
        return this.rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
