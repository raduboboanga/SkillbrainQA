package Tema2.PunctulB;

public class Ex5 {

    public static void problema5() {
        double[] arrayA = {2.5, 4.5, 6.7, 8.4};
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == 4.5) {
                System.out.println("Afișează pe ecran elementul " + arrayA[i] + " este egal cu 4.5");
            }
            if (arrayA[i] > 5) {
                System.out.println("Elementul peste 5 " + arrayA[i]);
            }
        }
    }

}
