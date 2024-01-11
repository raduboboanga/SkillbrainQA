package Tema2.PunctulB;

import java.util.ArrayList;

public class Ex8 {

    public static void problema8() {
        int[] numbers1 = {2, 4, 6};
        boolean arrayGol = numbers1.length == 0;
        System.out.println("Array-ul este gol: " + arrayGol);
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(10);
        numbers2.add(5);
        numbers2.add(15);
        boolean listaGoala = numbers2.isEmpty();
        System.out.println("Lista este goala: " + listaGoala);
    }
}
