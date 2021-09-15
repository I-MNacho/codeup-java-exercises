
//Create a Vehicle class with two properties: a name instance variable and a makeNoise() method. The instance variable should be private and have getters and setters (in IntelliJ try cmd-N). The makeNoise method should just sout out a typical vehicle noise. Then create a more specific vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever. Make the specific vehicle class extend the Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it VehicleTest Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.

package Vehicle;

public class Vehicle {

    private String name;
    
//getters and setters of name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//makes noise method creation 
    public void makeNoise(){
        System.out.println("Vroom vroom");
    }

    //empty constructor
    public Vehicle(){

    }

    //constructor with parameter for name
    public Vehicle(String name){
        this.name = name;
        System.out.println("A new car has been made.");
    }


    public void breakingDownNoise() {
        System.out.println("errrreeekkkkk trugh trug");
    }
}
