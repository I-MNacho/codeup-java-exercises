package birds;

public class Bird {

    public static int birdCount;

    //what kind of bird is it?
    private String name;

    //getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //what the bird does
    public void makeNoise(){
        System.out.println("Tweet tweet");
    }

    public void move(){
        System.out.println("Flap flap");
    }


//overload the constructor
    public Bird(){
        System.out.println("A new Bird has been created");

    }

    public Bird(String name){
        this.name = name;
        System.out.println("A new bird has been created.");
        this.incrementAndOutputBirdCount();
    }

    public void incrementAndOutputBirdCount(){
        birdCount++;
        System.out.println("There are now " + birdCount + " birds");
    }
}
