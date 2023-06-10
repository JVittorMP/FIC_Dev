package Dia09.Sala;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double resultado = calc.somar(10, 20);
        if(resultado != 30)
            System.out.println("Ops! Resultado não esperado!");
        else
            System.out.println("OK! Resultado Correto!");
    }
}
