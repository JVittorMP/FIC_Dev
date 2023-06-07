package Dia07.Desafio07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transporte> transportes = new ArrayList<>();

        Transporte bicicleta = new Bicicleta("RTX", 2, 1);
        Transporte triciclo = new Triciclo("RTX", 3, 1);
        Transporte carroca = new Carroca("Animal", 2, 2);
        Transporte charrete = new Charrete("Humana", 2, 2);
        Transporte caminhao = new Caminhao("Volvo", "BRA0X01", "Y001X", 12, 2);
        Transporte carro = new Carro("Wolkswagen", "BRA0X02", "Y002X", 4, 6);
        Transporte moto = new Moto("BMW", "BRA0X03", "Y003X", 2, 2);

        transportes.add(bicicleta);
        transportes.add(triciclo);
        transportes.add(carroca);
        transportes.add(charrete);
        transportes.add(caminhao);
        transportes.add(carro);
        transportes.add(moto);

        System.out.println(String.format("Coleção de Veículos de Transporte" + "%n"));
        for(Transporte transporte : transportes){
            System.out.println(transporte);
            transporte.transportar();
            System.out.println();
        }
    }
}
