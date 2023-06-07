package Dia06.Desafio06;

public class Incrementador {
    private int identifier = 1;


    public int getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getNextValue() {
        return this.identifier++;
    }
}
