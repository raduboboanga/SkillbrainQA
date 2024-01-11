package Tema2.PunctulB;

public class Ex6 {

    public static void problema6() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < elements.length; i++) {
            if (i == 2) {
                continue;
            } else if (i == 7) {
                break;
            } else {
                System.out.println("Index valid:" + i);
            }
        }
    }
}
