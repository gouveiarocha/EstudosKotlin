package poo.AtividadePratica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {

    static int tempoTotal = 200000;

    public static void main(String[] args) {

        testaArray();
        testaHash();

    }

    public static void testaArray(){

        Collection<Integer> teste = new ArrayList<>();

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < tempoTotal; i++) {
            teste.add(i);
        }

        for (int i = 0; i < tempoTotal; i++){
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();

        long tempo = fim - inicio;

        System.out.println("Tempo total gasto ArrayList: " + tempo);

    }

    private static void testaHash(){

        Collection<Integer> teste = new HashSet<>();

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < tempoTotal; i++) {
            teste.add(i);
        }

        for (int i = 0; i < tempoTotal; i++){
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();

        long tempo = fim - inicio;

        System.out.println("Tempo total gasto HashSet: " + tempo);

    }

}
