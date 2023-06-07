package Dia07.Desafio07;

public class Carroca extends Transporte {
    private String tracao;
    private int rodas;

    public Carroca(String tracao, int rodas, int capacidade) {
        super(capacidade);
        this.tracao = tracao;
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Carroca(" +
            "Capacidade: " + getCapacidade() + " | " +
            "Tracao: " + tracao + " | " +
            "Rodas: " + rodas + ")";
    }

    public void transportar(){
        System.out.println("Carroca Transportanto Pessoas e Cargas...");
    }

    public String getTracao() {
        return this.tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public int getRodas() {
        return this.rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
