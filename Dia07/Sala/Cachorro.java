package Dia07.Sala;

public class Cachorro extends Animal {
    Pelagem pelagem;
    
    public Cachorro(int p, int a){
        super(p, a);
    }
    
    public Cachorro(int p, int a, Pelagem pelagem){
        super(p, a);
        this.pelagem = pelagem;
    }

    @Override
    public String toString() {
        return "Cachorro(Patas: " + super.getPata() + ", Altura: " + super.getAltura() + ", Pelagem: " + pelagem + ')';
    }
    
    @Override
    public void falar() {
        System.out.println("Au Au!");
    }

    public Pelagem getPelagem() {
        return pelagem;
    }

    public void setPelagem(Pelagem pelagem) {
        this.pelagem = pelagem;
    }
}
