package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
    public static boolean esteCaracterulPrezent(String sir,char caracterulCautat) {

        boolean caracterExista = false;
        for (int i = 0; i < sir.length(); i++) {
            if (sir.charAt(i) == caracterulCautat) {
                caracterExista = true;
                break;
            }
        }

        if (caracterExista) {
           return caracterExista;
        } else {
            return caracterExista;
        }
    }
    public static boolean estePrim(int numar){
        if (numar <= 1){
            return false;
        }
        for (int i=2; i <numar; i++){
            if (numar % i==0){
                return false;
            }
        }
        return true;
    }
}