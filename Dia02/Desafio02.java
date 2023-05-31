package Dia02;

import java.util.Scanner;

public class Desafio02 {
    
    public static void main(String[] args){
        System.out.println("Dia 2: 30/05/2023 - Informações de uma Empresa");
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o nome da empresa: ");
        String nome = input.nextLine();
        char token = nome.charAt(0);
        
        System.out.print("Insira a quantidade de funcionários da empresa: ");
        int funcionarios = input.nextInt();
        
        System.out.print("Insira o faturamento da empresa (R$): ");
        double faturamento = input.nextDouble();
        
        System.out.print("Os documentos da empresa estão regularizados? ");
        boolean regularizado = input.nextBoolean();
        
        System.out.printf("A empresa %s (%c) possui %d funcionarios e faturamento de R$ %.2f \n", nome, token, funcionarios, faturamento);
        System.out.printf("%s está com os documentos regularizados? %s \n", nome, (regularizado ? "Sim" : "Não"));
    }
}
