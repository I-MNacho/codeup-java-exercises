package Review;

public class Instructor extends Person{

    @Override
    public void eat(String levelOfPoliteness){
        super.eat(levelOfPoliteness);           //super() just lets you do what the parent class does plus something else.
        System.out.println();           //<-- the something elsej
    }

}
