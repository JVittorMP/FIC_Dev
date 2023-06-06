package Dia04.Sala;

import java.util.Scanner;

public class MenuBebidas {
    public static void cardapio(){
        System.out.println("Menu de Bebidas");
        System.out.println("1: Refrigerante");
        System.out.println("2: Chá");
        System.out.println("3: Café");
        System.out.println("4: Energético");
        System.out.println("5: Suco");
        System.out.println("6: Tônico");
        System.out.println("7: Água");
        System.out.println("0: Sair");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cardapio();
        System.out.print("Insira a opção desejada: ");
        int op = sc.nextInt();
        
        while(op < 0 || op > 7) {
            System.out.println("Opção Inválida!");
            System.out.print("Digite Novamente: ");
            op = sc.nextInt();
        }
        System.out.println();
        
        if(op != 0)
            System.out.print("Preço: ");
               
        switch(op){
            case 1 -> System.out.println("R$ 4.50");
            case 2 -> System.out.println("R$ 3.49");
            case 3 -> System.out.println("R$ 2.00");
            case 4 -> System.out.println("R$ 8.99");
            case 5 -> System.out.println("R$ 6.99");
            case 6 -> System.out.println("R$ 5.99");
            case 7 -> System.out.println("R$ 2.50");
            case 0 -> System.out.println("Sair...");
        }

        sc.close();
    }
}
