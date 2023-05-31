package Dia2;

public class MinhaClasse {
    // Variáveis de instância
    private int valor1;
    private int valor2;
    
    // Construtor
    public MinhaClasse(int v1, int v2) {
        this.valor1 = v1;
        this.valor2 = v2;
    }
    
    // Métodos
    public int somar() {
        return this.valor1 + this.valor2;
    }
    
    public int subtrair() {
        return this.valor1 - this.valor2;
    }
}
