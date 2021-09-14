package Vehicle;

public class VehicleTest {
    public static void main(String[] args) {


    //creation of Car
    Vehicle charger = new Vehicle();
    charger.setName("Charger");
    System.out.println(charger.getName() + " goes:");
    charger.makeNoise();


    Corvette Zr1 = new Corvette();
    Zr1.setName("corvette");
    System.out.println(Zr1.getName() + " goes:");
    Zr1.makeNoise();
    Zr1.breakingDownNoise();
    }


}
