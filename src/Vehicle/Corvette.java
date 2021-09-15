package Vehicle;

public class Corvette extends Vehicle{

    public void makeNoise(){
        System.out.println("Vrahhhmmm vrahhhmmm");
    }

    //empty constructor
    public Corvette(){
    }

//    public void breakingDownNoise(){
//        System.out.println("errrreeekkkkk trugh trug");
//    }

    public void setName(String carName){
        super.setName(carName);
    }

}
