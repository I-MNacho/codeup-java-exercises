package AbstractClassAndInterface.InterfaceExercises;


public class Pill implements Consumable {


    protected String name;

    public Pill(String name){
        this.name = name;
    }

    private String medicationName;
    private String pharmacistInstructions;

        // getters setters constructors...

    public void consume() {
        System.out.println(name + " " +": Drink down with fluid");
    }

    public void checkIfExpired() {
        System.out.println(name + " " + ": Check expiration date on pill bottle");
    }

    public void throwAway() {
        System.out.println(name + " " + ": Wash down sink...");
    }

}
