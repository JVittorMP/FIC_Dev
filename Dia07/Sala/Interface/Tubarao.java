package Dia07.Sala.Interface;

public class Tubarao implements Animal, Peixe {
    public void respirar() {
        System.out.println("Brânquias!");
    }
    
    public void nadar() {
        System.out.println("Mergulhando!");
    }
}
