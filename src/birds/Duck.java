package birds;

public class Duck extends Bird {        //<-- added class with an extends keyword, this allows us to use the public methods on Bird

    //let's override the superclass makeNoise() method
    //over riding: when
    public void makeNoise(){
        System.out.println("Quack quack");
    }

    public Duck(){
        super("Duck");
    }

    public void setName(String duckName){
        super.setName(duckName);
    }

    public Duck(String name){
        super(name);
//        this.setName(name);
        System.out.println("A new duck has been created.");
    }
}