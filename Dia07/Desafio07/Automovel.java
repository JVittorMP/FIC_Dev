package Dia07.Desafio07;

public abstract class Automovel extends Transporte {
    private String placa;
    private String chassi;
    private int rodas;

    public Automovel(String placa, String chassi, int rodas, int capacidade) {
        super(capacidade);
        this.placa = placa;
        this.chassi = chassi;
        this.rodas = rodas;
    }

    public abstract void transportar();

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return this.chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getRodas() {
        return this.rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
