package Dia05.Sala;

public class PassagemParametros {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.print("Antes de chamar o método: ");
        System.out.println("a = " + a + ", b = " + b);
        
        soma(a, b);
        
        System.out.print("Depois de chamar o método: ");
        System.out.println("a = " + a + ", b = " + b);
    }
    
    public static void soma(int x, int y) {
        
        int resultado = x + y;
        System.out.println("Resultado da soma: " + resultado);
        
        // ALtera o valor do parâmetro x
        x = 0;
        System.out.println("Valor de x dentro do método: " + x);
    }
}
