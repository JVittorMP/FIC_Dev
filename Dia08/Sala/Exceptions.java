package Dia08.Sala;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero!");
        }
    }
}
