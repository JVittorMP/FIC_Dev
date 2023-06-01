package Dia03.Sala;

public class TestePessoa {
    public static void main(String[] args) {
        // instanciação da classe Pessoa
        Pessoa p1 = new Pessoa();
        p1.setNome("Paulo");
        p1.setIdade(23);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}
