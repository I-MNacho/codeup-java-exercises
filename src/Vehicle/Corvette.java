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
