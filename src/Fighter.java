public class Fighter {
    //instance variables
    //encapsulating your variables
    //by making them private and then making a set and get variables public you can protect your variables
    //then in the test file you can call them by the variable names
//----------------------------------------------------
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//----------------------------------------------------

    private int hitPoints;

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints(){
        return hitPoints;
    }
//----------------------------------------------------

    private int maxDamage;

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
//----------------------------------------------------

    //Methods
    public void printStats(){
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " points of damage.");
    }

    public void battleRoar(){
        System.out.println("I am " + name + ", prepare to be defeated!");
    }

    //you call a static method with a class name(ex: D20.roll20())
    //you call a non-static method using a reference variable name (object method) (ex: arata.attackRoll())

    public int attackRoll(){
        return D20.roll20();        //<--call class and then call method we want to use
    }

//default constructor <-- made when one isn't specified
    //when we add parameters it no longer becomes the constructor
    //we can overload the constructor and make another method

    //now this is the default constructor
    public Fighter() {
    }

//by using this we can create multiple fighters with parameters already set and ready to apply variables.
    public Fighter(String name, int hitPoints, int maxDamage){
        System.out.println("A new fighter has emerged");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
        this.printStats();
}
//DON'T DO THIS: PUT THE MAIN METHOD IN THE CLASS METHOD    <-- move below code to a test file, moved to FighterTest file

}
