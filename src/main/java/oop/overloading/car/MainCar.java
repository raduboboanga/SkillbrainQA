package oop.overloading.car;

public class MainCar {

    public static void main(String[] args) {
        Car car1 = new Car("Natasha");
        Car car2 = new Car();
        Car car3 = new Car("SuperSpeed", "albastra");

        System.out.println(car3.getNume());

        Car car4 = new Car("Jana", "rosie", "Nissan");
        // System.out.println(car4);
        /*car4.printDetails("","","");
        car4.printDetails("","");
        car4.printDetails("");*/

        SportsCar sportsCar = new SportsCar("Viki", "rosie", "Nissan");
        sportsCar.printDetails("");
        sportsCar.printDetails("", "");
        sportsCar.printDetails("", "", "");

    }

}
