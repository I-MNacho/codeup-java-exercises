package AbstractClassAndInterface.Animal;

public class Cat extends Pet {

    public void rest(int noOfHours) {
        for (int i = 0; i <= noOfHours; i += 1) {
            System.out.println("Zzzzzzz....");
        }
    }

    @Override
    public void responseToCommand(String command) {
        System.out.println("Meow... coughs up hairball...");
    }

}
