package Vehicle;

import birds.Bird;
import birds.Duck;

public class VehicleTest {
    public static void main(String[] args) {


    //creation of Car
//    Vehicle charger = new Vehicle();
//    charger.setName("Charger");

    //creation of car after creating empty and overloaded constructor
    Vehicle charger = new Vehicle("Charger");

    System.out.println(charger.getName() + " goes:");
    charger.makeNoise();

//creation of Car
//    Corvette Zr1 = new Corvette();
//    Zr1.setName("corvette");

    //creation of car after creating empty and overloaded constructor
    Vehicle Zr1 = new Vehicle("Corvette Zr1");

    System.out.println(Zr1.getName() + " goes:");
    Zr1.makeNoise();
    Zr1.breakingDownNoise();

//creation of new car
        Vehicle nissanZ = new Vehicle("370z");
        System.out.println(nissanZ.getName());



    }
}
