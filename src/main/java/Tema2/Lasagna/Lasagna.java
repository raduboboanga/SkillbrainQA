package Tema2.Lasagna;

public class Lasagna {

    // Task 1: Define the expected oven time in minutes
    public int expectedMinutesInOven() {
        return 40;
    }

    // Task 2: Calculate the remaining oven time in minutes
    public int remainingMinutesInOven(int minuteInCuptor) {
        return Math.max(0, expectedMinutesInOven() - minuteInCuptor);
       // reutrn minuteInCuptor >= expectedMinutesInOven() ? 0 : expectedMinutesInOven() - minuteInCuptor
    }

    // Task 3: Calculate the preparation time in minutes
    public int preparationTimeInMinutes(int layers) {
        // Assuming each layer takes 2 minutes to prepare
        return layers * 2;
    }

    // Task 4: Calculate the total working time in minutes
    public int totalTimeInMinutes(int layers, int minute) {
        return preparationTimeInMinutes(layers) + minute;
    }

}





