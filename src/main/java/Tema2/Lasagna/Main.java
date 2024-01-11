package Tema2.Lasagna;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Lasagna class
        Lasagna lasagna = new Lasagna();

        // Task 1: Get the expected oven time
        int expectedOvenTime = lasagna.expectedMinutesInOven();
        System.out.println("Expected oven time: " + expectedOvenTime + " minutes");

        // Task 2: Calculate remaining oven time
        int remainingOvenTime = lasagna.remainingMinutesInOven(30);
        System.out.println("Remaining oven time: " + remainingOvenTime + " minutes");

        // Task 3: Calculate preparation time
        int preparationTime = lasagna.preparationTimeInMinutes(2);
        System.out.println("Preparation time: " + preparationTime + " minutes");

        // Task 4: Calculate total working time
        int totalTime = lasagna.totalTimeInMinutes(3, 20);
        System.out.println("Total working time: " + totalTime + " minutes");
    }
}

