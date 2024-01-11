package Tema2.PunctulB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex9 {

    public static void problema9() {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(56);
        liste.add(76);
        liste.add(80);
        liste.add(10);
        liste.add(170);

        Collections.sort(liste);
        System.out.println("Elementele din array aranjate in original:" + liste);

        Collections.sort(liste, Collections.reverseOrder());
        System.out.println("Elementele din array aranjate descrecător: " + liste);


        Integer[] liste2 = {4, 14, 8,76, 97,100, 105};
        Arrays.sort(liste2);
        System.out.println("Sortare crescătoare" + Arrays.toString(liste2));


        Arrays.sort(liste2, Collections.reverseOrder());
        System.out.println("Sortare descrescătoare: " + Arrays.toString(liste2));
    }
}
