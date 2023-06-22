package Dia12.Desafio12;

import java.util.Locale;
import java.util.Scanner;

import Dia12.Desafio12.Model.Aluno;
import Dia12.Desafio12.View.AlunoControle;

public class Main {
    private static AlunoControle alunoControle = new AlunoControle();
    private static Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public static Aluno obterAluno() {
        Aluno aluno = new Aluno();
        System.out.print("Nome: ");
        String nome = input.nextLine();
        aluno.setNome(nome);
        System.out.print("Coeficiente: ");
        double num = Double.parseDouble(input.nextLine());
        aluno.setCoeficiente(num);
        return aluno;
    }

    public static Aluno selecionarAluno() {
        alunoControle.listarAlunos();
        System.out.print(String.format("%n" + "Insira o ID Desejado: "));
        int id = Integer.parseInt(input.nextLine());
        Aluno aluno = alunoControle.read(id);
        return aluno;
    }

    public static void main(String[] args) {
        boolean stop = false;

        while(!stop) {
            Aluno aluno;
            alunoControle.exibirMenu();
            System.out.print(String.format("Insira a Opção Desejada: " + "%n"));
            int opc = Integer.parseInt(input.nextLine());
            switch(opc) {
                case 1:
                    System.out.println("Insira os Dados");
                    aluno = obterAluno();
                    alunoControle.create(aluno);
                    break;
                case 2:
                    aluno = selecionarAluno();
                    System.out.println("Insira os Novos Dados");
                    Aluno novo = obterAluno();
                    aluno.setCoeficiente(novo.getCoeficiente());
                    aluno.setNome(novo.getNome());
                    alunoControle.update(aluno);
                    break;
                case 3:
                    aluno = selecionarAluno();
                    alunoControle.delete(aluno);
                    break;
                case 4:
                    alunoControle.listarAlunos();
                    break;
                case 5:
                    aluno = selecionarAluno();
                    System.out.print("Insira o Novo Coeficiente: ");
                    double novoCoeficiente = Double.parseDouble(input.nextLine());
                    alunoControle.atualizarCoeficiente(aluno.getId(), novoCoeficiente);
                    break;
                case 0:
                    stop = true;
                    break;
            }
        }

        alunoControle.close();
        input.close();
    }
}
