public class ControlStatementAndLoops {
    public static void main(String [] args) {
        // you can solve any programming problem with just
        //Statements
        //Decisions
        //Loops

        //You can:
        //Do Something
        //Do Something under a certain condition
        //Do something again and again


        //Key differences about Java statements vs javascript
        // no Automatic Semicolon Insertion
        //all variables need a type declaration

        // Conditional Branching:
        // Almost identical to JS.
        int x = 5;
        if (x == 5){
            System.out.println("If you are reading this, x must be 5 since this is running");
        }
        System.out.println("On the other hand , this doesn't mean anything because it runs regardless of what x is");

        int y = 2;
        y = 3;
        if (y == 2){
            System.out.println("I've carried out a conditional test and I can confirm that the statement 'y == 2' is true");
        }else{
            System.out.println("The result of my condtional test was false");
        }
//        System.out.println(y==2);
}
}
