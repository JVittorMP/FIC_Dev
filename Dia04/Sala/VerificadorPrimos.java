package Dia04.Sala;

import java.util.Scanner;

public class VerificadorPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sair;
        
        do {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            boolean primo = true;

            if(num == 1 || (num % 2 == 0 && num != 2)){
                primo = false;
            } else if(num % 2 != 0){
                for(int i = 3; i <= Math.sqrt(num); i += 2){
                    if(num % i == 0){
                        primo = false;
                        break;
                    }
                }
            }

            if(primo)
                System.out.println(num + " - Número Primo");
            else
                System.out.println(num + " - Número Composto");
            
            System.out.print("Deseja Sair(S/N)? ");
            sair = sc.next().charAt(0);
            System.out.println();
        } while(sair != 'S');
        
        sc.close();
    }
}
