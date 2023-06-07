package Dia08.Desafio08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/test.txt"));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (FileNotFoundException E1) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException E2) {
            System.out.println("Erro na leitura de arquivo!");
        }
    }
}
