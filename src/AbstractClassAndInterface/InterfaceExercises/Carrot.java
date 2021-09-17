package AbstractClassAndInterface.InterfaceExercises;

public class Carrot implements Consumable {

    protected String name;

    public Carrot(String name){
        this.name = name;
    }

    private boolean isPeeled;

        // getters setters constructors...

    public void consume() {
        System.out.println(name + " " + "Eat, bite by bite");
    }

    public void checkIfExpired() {
        System.out.println(name + " " + "Observe color and smell");
    }

    public void throwAway() {
        System.out.println(name + " " + "Throw into compost pile");
    }

}
