package Tema2.PunctulB;

import java.util.ArrayList;

public class Ex7 {

    public static void problema7() {
        ArrayList<Integer> listaInt = new ArrayList<Integer>();
        listaInt.add(7);
        listaInt.add(10);
        listaInt.add(12);
        listaInt.add(28);
        listaInt.add(49);
        int suma = 0;
        for (Integer i : listaInt) {
            suma += i;
        }
        System.out.println("Suma tuturor elementelor: " + suma);
    }

}
