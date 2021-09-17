package AbstractClassAndInterface.InterfaceExercises;

public class ConsumableTest {
    public static void main(String[] args) {

        Carrot carrot = new Carrot("Blue carrot");
        carrot.consume();
        carrot.checkIfExpired();
        carrot.throwAway();


        Pill pill = new Pill("Pillbo Baggins");
        pill.consume();
        pill.checkIfExpired();
        pill.throwAway();




    }
}
