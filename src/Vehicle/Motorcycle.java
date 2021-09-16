//Create a new kind of vehicle that extends vehicle.
// Define the class as final.
// Create a makeNoise method that overrides the superclass method.
// Test it in your VehicleTest class.
// Now alter it so your subclass makeNoise method calls the superclass makeNoise method in addition to its own noise.
// Add one of your new kinds of vehicles to the array of vehicles in your Garage or Marina or Hangar and trigger the alarmCascade method to verify that your new car can exist in a polymorphic array. Add a subclass constructor that takes a String argument and make sure you have no errors.

package Vehicle;

import birds.Penguin;

public final class Motorcycle extends Vehicle{

    public void makeNoise(){
//        super.makeNoise();
        System.out.println(this.name + " goes Zoom ahhhh zoom");
    }

    public Motorcycle(){
        super();
        System.out.println("A new motorcycle has been created.");
    }

//    public Motorcycle(){
//
//    }

    public Motorcycle(String motorcycleName){
        this.name = motorcycleName;
    }
}
