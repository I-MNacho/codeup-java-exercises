package AbstractClassAndInterface.Animal;

public class Dog extends Pet{

    public void rest(){
    }

    @Override
    public void responseToCommand(String command) {
        System.out.println("Obeys " + command + " dutifully...");
    }

}