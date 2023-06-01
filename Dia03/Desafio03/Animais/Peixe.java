package Dia03.Desafio03.Animais;

public class Peixe {
    private String nome;
    private String genero;
    private String especie;
    private String habitat;
        
    public Peixe(String nome, String genero, String especie, String habitat) {
        this.nome = nome;
        this.genero = genero;
        this.especie = especie;
        this.habitat = habitat;
    }
    
    public void nicho() {
        System.out.println("Peixe: " + this.nome + " - Espécie: " + this.genero + " " + this.especie);
        System.out.println("Peixe de " + habitat);
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

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
