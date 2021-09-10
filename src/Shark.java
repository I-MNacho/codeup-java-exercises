//    Create a class for your favorite type of animal. The class should be named for your animal - Cat, Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.
public class Shark {
//----------------------------------------------------

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//----------------------------------------------------

    private String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    //----------------------------------------------------

    private int eat;

    public void setEat(int eat) {
        this.eat = eat;
    }

    public int getEat() {
        return eat;
    }

    //----------------------------------------------------
    private int grannysEaten;

    public void setGrannysEaten(int grannysEaten) {
        this.grannysEaten = grannysEaten;
    }

    public int getGrannysEaten() {
        return grannysEaten;
    }
    //----------------------------------------------------

public void makeNoise(){
    System.out.println("The " + name + " goes " + sound + " eats " + eat);
}

public void visitsYoGranny(){
    System.out.println("I ate yo granny");
    grannysEaten++;
    System.out.println("I ate " + grannysEaten + " ol lady");
}

    public void printAttributes(){
        System.out.println(name + " makes " + sound + " sound and can eat " + eat + " dingus's");
    }
    
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


    public Shark(String name, String sound, int eat){
        System.out.println("A new shark crept up behind you!");
        this.name = name;
        this.sound = sound;
        this.eat = eat;
        this.printAttributes();
    }
}




