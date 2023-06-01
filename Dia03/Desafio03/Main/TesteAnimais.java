package Dia03.Desafio03.Main;

import Dia03.Desafio03.Animais.Ave;
import Dia03.Desafio03.Animais.Peixe;

public class TesteAnimais {
    public static void main(String[] args) {
        Ave ave = new Ave("Mordecai", "Cyanocitta", "cristata", true);
        Peixe peixe = new Peixe("Oscar", "Amphiprion", "ocellaris", "Água Salgada");
        
        ave.nicho();
        System.out.println();
        peixe.nicho();
    }
}
