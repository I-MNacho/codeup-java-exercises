package birds;

public class Bird {
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

    public Bird(){

    }

}
