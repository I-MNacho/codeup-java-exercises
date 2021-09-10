public class Fighter {
    //instance variables
    public String name;
    public int hitPoints;
    public int maxDamage;
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
public Fighter(){

}
//DON'T DO THIS: PUT THE MAIN METHOD IN THE CLASS METHOD    <-- move below code to a test file, moved to FighterTest file

}
