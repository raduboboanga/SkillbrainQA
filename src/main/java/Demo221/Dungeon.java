package Demo221;

import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        //variabile de jucator
        int sanatate = 100;
        int atacDeteriorare = 50;
        int potiuni = 3;
        int valoareRegenerarePotiune = 30;
        int sansaPotiune = 50;  //procentaj

        //variabile de inamic
        String[] inamici = {"Zombie", "Skeleton", "Warrior", "Assasin"};
        int maxSanatateInamic = 75;
        int inamicAtacDeteriorare = 25;

        boolean running = true;
        System.out.println("Bine ai venit in Temnita! ");

        GAME:
        while (running) {
            System.out.println("-----------------------");

            int sanatateInamic = random.nextInt(maxSanatateInamic);
            String inamic = inamici[random.nextInt(inamici.length)];

            System.out.println("\t# " + inamic + " a aparut! #");

            while (sanatateInamic > 0) {
                System.out.println("\tSanatate ta este: " + sanatate);
                System.out.println("\tSanatatea inamicului " + inamic + " este: " + sanatateInamic);
                System.out.println("\t\n Ce ai vrea sa faci?");
                System.out.println("\t1. Ataca");
                System.out.println("\t2. Bea potiune");
                System.out.println("\t3. Fugi");

                String input = in.nextLine();
                if (input.equals("1")) {
                    //cod pentru actiunea de a ataca
                    int deteriorareProdusa = random.nextInt(atacDeteriorare);
                    int deteriorarePrimita = random.nextInt(inamicAtacDeteriorare);

                    sanatateInamic -= deteriorareProdusa;
                    sanatate -= deteriorarePrimita;
                    System.out.println("\tL-ai lovit pe " + inamic + "cu " + deteriorareProdusa + "deteriorare. ");
                    System.out.println("\tAi primit " + deteriorarePrimita + " deteriorare");

                    if (sanatate < 1) {
                        System.out.println("\tAi fost lovit prea tare esti prea slabit sa continui ");
                        break;
                    }


                } else if (input.equals("2")) {
                    //cod pentru actiunea de a bea
                    if (potiuni > 0) ;
                    sanatate += valoareRegenerarePotiune;
                    potiuni--;
                    System.out.println("\tAi baut o potiune, te-ai vindecat cu " + valoareRegenerarePotiune + "\n\t Acum ai " + sanatate + " sanatate." + "\n\tTi-au ramas " + potiuni + " potiuni.");
                }else {
                    System.out.println("\tNu mai ai potiuni! Invinge un inamic ca sa mai castigi optiuni. \n");
                } if (input.equals("3")) {
                    //cod pentru actiunea de a fugi
                    System.out.println("\tAi fugit de " + inamic);
                    continue GAME;
                } else {
                    //cod pentru optiune invalida
                    System.out.println("\tComanda invalida");
                }

            }

        }
    }
}
