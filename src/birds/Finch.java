package birds;

public class Finch extends Bird {
    public void makeNoise(){
        //call the superclass makeNoise method
        super.makeNoise();
        // then add extra custom code after running super class code
        System.out.println("Chirp chirp");
    }

}
