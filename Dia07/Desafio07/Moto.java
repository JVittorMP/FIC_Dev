package Dia07.Desafio07;

public class Moto extends Automovel {
    private String marca;

    public Moto(String marca, String placa, String chassi, int rodas, int capacidade) {
        super(placa, chassi, rodas, capacidade);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Moto(" +
            "Chassi: " + getChassi() + " | " +
            "Placa: " + getPlaca() + " | " +
            "Marca: " + marca + " | " +
            "Capacidade: " + getCapacidade() + " | " +
            "Rodas: " + getRodas() + ")";
    }

    public void transportar(){
        System.out.println("Moto Transportanto Pessoas e Cargas...");
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
