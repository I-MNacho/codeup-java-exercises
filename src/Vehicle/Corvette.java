package Vehicle;

public class Corvette extends Vehicle{

    public void makeNoise(){
        System.out.println("Vrahhhmmm vrahhhmmm");
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("errrreeekkkkk trugh trug");
    }

}
//    Create a Car class if you have not already done so. It should be a subclass of Vehicle. Create a Garage class with two properties. It should have a Vehicle array called vehicles, and an alarmCascade() method that simulates all the vehicles in the array having their alarms go off in sequence. Create a GarageTest class. Create at least three cars and set their names. Put them in an array of vehicles. Instantiate a garage, assign your array to the garage's vehicles property and run the alarmCascade method. Now replace one of the cars with another type of vehicle. Run the alarmCascade method again and note that the vehicles array is polymorphic and can contain different types of vehicles.