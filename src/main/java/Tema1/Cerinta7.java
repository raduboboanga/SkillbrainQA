package Tema1;

import java.util.Scanner;

public class Cerinta7 {
    public static void main(String[] args) {
        System.out.println("Introduceti un numar: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Rezultatul sumei cu 5 este: " + (a + 6));
        System.out.println("Rezultatul scăderii cu 12.3 este: " + (a-12.3));
        System.out.println("Rezultatul înmulțire cu -3.2 este: " + (a*(-3.2)));
        System.out.println("Rezultatul împărțire cu 4 este: " + (a/4.0));
        System.out.println("Restul împărâirii lui" + a + "la 6 este " + (a%6));
    }


}
