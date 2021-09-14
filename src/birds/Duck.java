package birds;

public class Duck extends Bird {        //<-- added class with an extends keyword, this allows us to use the public methods on Bird

    //let's override the superclass makeNoise() method
    //over riding: when
    public void makeNoise(){
        System.out.println("Quack quack");
    }
}