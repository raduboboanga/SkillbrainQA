package Tema2.AnnalynsInfiltration;

import static Tema2.AnnalynsInfiltration.AnnalynsInfiltration.*;

public class Main {
    public static void main(String[] args) {
        // Task 1: Check if a fast attack can be made
        boolean knightIsAwake = true;
        System.out.println("Can a fast attack be made? " + canFastAttack(knightIsAwake));

        // Task 2: Check if the group can be spied upon
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println("Can the group be spied upon? " + canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));

        // Task 3: Check if the prisoner can be signalled
        archerIsAwake = false;
        prisonerIsAwake = true;
        System.out.println("Can the prisoner be signalled? " + canSignalPrisoner(archerIsAwake, prisonerIsAwake));

        // Task 4: Check if the prisoner can be freed
        boolean petDogIsPresent = false;
        System.out.println("Can the prisoner be freed? " + canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }
}
