package interfacesAbstractClassesLecture;

import AbstractClassAndInterface.StringTransformer.StringTransformer;

import java.util.Arrays;

public class Waiter extends Employee implements Transferable{

    @Override
    public String doWork() {
        return "Serving the guests...";
    }

    @Override
    public void transferToNewLocation(String location){
        System.out.println("Moving to " + location + ". Checking with manager of that location...");
    }

    @Override
    public String[] getListOfPossibleTransferLocations(){
        return new String[]{"location1", "location2"};
    }

    public static void main(String[] args) {
        //create waiter
//        Waiter waiter = new Waiter();
//        System.out.println(waiter.doWork());


        //can we create a employee of type Employee?
        // A:no

        //can we create an employee of type waiter?
//        Waiter w = new Employee();     no does not work

        //Can we create a waiter of type Waiter? A: yes
//        Waiter waiter = new Waiter();

        //Can we create a waiter of type Employee? A: yes
//        Employee waiter = new Waiter();
//        Employee developer = new Developer();
//
//        Employee[] employees = {waiter, developer};
//        employeesDoWork(employees);

        //Q: Out of the four pillars of OOP, what does this best demonstrate?
        //abstraction, inheritance, polymorphism, encapsulation...?
        //A:

        //can create a variable of type interface now
        Transferable waiter1 = new Waiter();
        waiter1.transferToNewLocation("San Antonio Location 4");
//        System.out.println(Arrays.toString(waiter1.getListOfPossibleTransferLocations()));

//        System.out.println(waiter1.doWork());       //<-- wont do anything when doWork is called because

    Transferable[] transferables = {waiter1};
    transferStuff(transferables, "Dallas, TX");
    }

    public static void transferStuff(Transferable[] transferables, String location){
        for (Transferable transferable : transferables){
            transferable.transferToNewLocation(location);
        }
    }


    public static void employeesDoWork(Employee[] employees){
        for (Employee e : employees){
            System.out.println(e.doWork());
        }
    }
}
