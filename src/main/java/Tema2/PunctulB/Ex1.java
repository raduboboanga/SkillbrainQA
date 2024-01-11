package Tema2.PunctulB;

import java.util.Scanner;

public class Ex1 {

    public static void problema1() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceți un număr: ");
        int numar = scanner1.nextInt();
        scanner1.close();

        int numarRandom = (int) (Math.random() * 101);
        System.out.println("Numărul introdus: " + numar);
        System.out.println("Numărul generat aleatoriu: " + numarRandom);

        if (numar < numarRandom) {
            System.out.println("Numarul introdus" + numar + "este mai mic decat " + numarRandom);
        } else {
            System.out.println("Numarul este mai mare.");
        }

    }
}
