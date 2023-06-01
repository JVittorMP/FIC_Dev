// Definindo o pacote do programa
package Dia03.Sala.Geometria;

// Definindo a classe Retangulo
public class Retangulo {
    
    // Propriedades do retângulo
    private double base;
    private double altura;

    // Construtor da classe
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Método para calcular a área do retângulo
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro(){
        return 2 * (this.base + this.altura);
    }
}
