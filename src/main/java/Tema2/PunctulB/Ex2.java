package Tema2.PunctulB;

import java.util.Scanner;

public class Ex2 {

    public static void problema2() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti un caracter ('a','s','i','p','m'):");
        char caracter = scanner2.next().charAt(0);
        System.out.println("Introduceti primul numar:");
        int numar1 = scanner2.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int numar2 = scanner2.nextInt();

        int rezultat;
        switch (caracter) {
            case 'a':
                rezultat = numar1 + numar2;
                System.out.println("Rezultatul adunarii:" + rezultat);
                break;
            case 's':
                rezultat = numar1 - numar2;
                System.out.println("Diferența celor două numare este: " + rezultat);
                break;
            case 'i':
                rezultat = numar1 * numar2;
                System.out.println("Inmulțirea celor două numere este: " + rezultat);
                break;
            case 'p':
                rezultat = numar1 / numar2;
                System.out.println("Imparțirea celor două numere este: " + rezultat);
                break;
            case 'm':
                rezultat = numar1 % numar2;
                System.out.println("Modulul celor două numere este: " + rezultat);
                break;
            default:
                System.out.println("Caracterul introdus nu este valid.");

        }
    }
}