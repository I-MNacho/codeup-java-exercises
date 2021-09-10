//    Create a class for your favorite type of animal. The class should be named for your animal - Cat, Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.
public class Shark {
    public String name;
//    public String sound;
//    public String eat;
//    public int grannysEaten;


//public void makeNoise(){
//    System.out.println("The " + name + " goes " + sound + " eats " + eat);
//}
//
//public void visitsYoGranny(){
//    System.out.println("I ate yo granny");
//    grannysEaten++;
//    System.out.println("I ate " + grannysEaten + " ol lady");
//}

    public static int randomQuote() {
        return (int) ((Math.random() * 4) + 1);
    }

    public static String screamHeard() {
        if (randomQuote() == 1) {
            return "Im sorry for being a Twilight fan!!!!";
        } else if (randomQuote() == 2) {
            return "Goodbye cruel world!!";
        } else if (randomQuote() == 3) {
            return "Delete my history!!";
        } else if (randomQuote() == 4) {
            return "Help me Tom Cruise!!";
        } else {
            return "this shouldn't happen";
        }
    }
}




