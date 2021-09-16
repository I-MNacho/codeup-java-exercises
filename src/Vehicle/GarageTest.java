package Vehicle;

public class GarageTest {
    public static void main(String[] args) {
        Car mustang = new Car();
        mustang.setName("Mustang");
        Car camero = new Car();
        camero.setName("Camero");
        Car audi = new Car();
        audi.setName("R8");

        Vehicle[] carsInTheGarage = new Vehicle[4];
        carsInTheGarage[0] = mustang;
        carsInTheGarage[1] = camero;
        carsInTheGarage[2] = audi;

        Helicopter helicopter = new Helicopter();
        helicopter.setName("helicopter");
        carsInTheGarage[3] = helicopter;

//        Helicopter helicopter = new Helicopter();
//        helicopter.setName("helicopter");
//        carsInTheGarage[2] = helicopter;

        Motorcycle ninja = new Motorcycle();
        ninja.name = "Ninja";
        carsInTheGarage[1] = ninja;

        Garage garage = new Garage();
        garage.vehicles = carsInTheGarage;
        garage.alarmCascade();


        Vehicle customersVehicle = garage.findVehicle("Mustang", carsInTheGarage);
        System.out.println(customersVehicle.getName());

        Vehicle customersVehicle2 = garage.findVehicle("R8", carsInTheGarage);
        System.out.println(customersVehicle2.getName());

        Vehicle customersVehicle3 = garage.findVehicle("Camero", carsInTheGarage);
        System.out.println(customersVehicle3.getName());

        Vehicle customersVehicle4 = garage.findVehicle("helicopter", carsInTheGarage);
        System.out.println(customersVehicle4.getName());

    }
}
