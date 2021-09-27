// 4. Create a class called Movie. The class should define two instance variables of type String named name and director. Add a constructor that takes two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters and setters for the instance variables.
// Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException

// Create a Comedy class that inherits from Movie
//Add a protected instance variable named funny that is boolean
//Write a constructor for Comedy defining parameters for all three instance variables, including a boolean for funny
//Write getters and setters for funny. The getter should be named isFunny


public class Movie implements Entertains {
    //instance variables
    private String name;
    private String director;

    //empty constructor
    public Movie(){}



    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //constructor
    public Movie(String name, String director) throws IllegalArgumentException {
        if(name == null || name.isBlank() || director == null || director.isBlank()){
            throw new IllegalArgumentException();
        }
    this.name = name;
    this.director = director;

    }

    @Override
    public String audienceReaction() {
        return "oooooooooh " + name + " was so awesome!";
    }
}
