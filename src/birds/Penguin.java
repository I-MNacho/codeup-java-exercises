package birds;

public class Penguin extends Bird{

    final String ORDER = "Sphenisciformes";

    public void makeNoise(){
        System.out.println("Honk Honk");
    }

    public void move(){ System.out.println("Waddle waddle"); }

    public Penguin(){
//        super();        //<-- invokes the super class constructor, but it is just understood and doesnt have to be put in
    }

//    public void argumentativePenguinScientist(){
//        System.out.println("I do not beleive we should call penguins ");
//        System.out.println("In fact penguins are psittaciformes");
//        this.ORDER = "Psittaciformes";
//    }
}
