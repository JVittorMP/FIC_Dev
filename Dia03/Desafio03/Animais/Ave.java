package Dia03.Desafio03.Animais;

public class Ave {
    private String nome;
    private String genero;
    private String especie;
    private boolean voador;

    public Ave(String nome, String genero, String especie, boolean voador) {
        this.nome = nome;
        this.genero = genero;
        this.especie = especie;
        this.voador = voador;
    }
    
    public void nicho() {
        System.out.println("Ave: " + this.nome + " - Espécie: " + this.genero + " " + this.especie);
        System.out.println("Voa? " + (voador ? "Sim" : "Não"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVoador() {
        return voador;
    }

    public void setVoador(boolean voador) {
        this.voador = voador;
    }
}
