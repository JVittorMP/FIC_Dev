package Dia11.Desafio11;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static AlunoDAO alunoDAO = new AlunoDAO();
    
    private static void atualizarCoeficiente(int id, double coeficiente){
        Aluno aluno = alunoDAO.read(id);
        aluno.setCoeficiente(coeficiente);
        alunoDAO.update(aluno);
    }
    
    public static void main(String[] args) {
        List<Aluno> alunos = alunoDAO.readAll();
        Aluno aluno;
        
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.KOREA);
        
        if(alunos.isEmpty()){
            aluno = new Aluno("Aluno Genérico", 10.0);
            alunoDAO.create(aluno);
        }
        
        String iden = "ID";
        String nome = "Nome";
        String coef = "Coeficiente";
        System.out.println(String.format("%s %-40s %s", iden, nome, coef));
        for(Aluno item : alunos){
            System.out.println(String.format("%-2s %-40s %s", item.getId(), item.getNome(), item.getCoeficiente()));
        }
        
        System.out.print(String.format("%n" + "Insira o ID Desejado: "));
        int id = input.nextInt();
        aluno = alunoDAO.read(id);
        
        System.out.print("Insira o Novo Coeficiente: ");
        double novoCoeficiente = input.nextDouble();
        
        atualizarCoeficiente(aluno.getId(),novoCoeficiente);
        
        System.out.println("Novo Coeficiente: " + alunoDAO.read(aluno.getId()).getCoeficiente());
        
        DBConnection.getConnection().close();
    }
}
