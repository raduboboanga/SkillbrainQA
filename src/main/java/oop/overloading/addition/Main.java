package oop.overloading.addition;

public class Main {
    public static void main(String[] args) {

        Adder adder = new Adder();

        int result = adder.add(9,7,8);

        String resultString = adder.add("6","5");

        System.out.println("Suma este: "+ result);

    }

}
