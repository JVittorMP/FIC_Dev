package Dia05.Sala.Carros;

public class Carro {
    public String modelo;
    protected int ano;
    private String fabricante;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
