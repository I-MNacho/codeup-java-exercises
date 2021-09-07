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
// --------------------------------------------------------------------------

        // Conditional Branching:
        // Almost identical to JS.
//        int x = 5;
//        if (x == 5){
//            System.out.println("If you are reading this, x must be 5 since this is running");
//        }
//        System.out.println("On the other hand , this doesn't mean anything because it runs regardless of what x is");


//// --------------------------------------------------------------------------
//        int y = 2;
//        y = 3;
//        if (y == 2){
//            System.out.println("I've carried out a conditional test and I can confirm that the statement 'y == 2' is true");
//        }else{
//            System.out.println("The result of my conditional test was false");
//        }
//        System.out.println(y==2);


// --------------------------------------------------------------------------
        //If else statements
//        short y = -5;
//        y = 12;
//        y = 32450;
//    // y = 33000; //incompatible types: possible lossy conversion from int to short
//
//        if (y < 0 ) {
//            System.out.println("The variable y contains a negative number");
//        } else if (y >=0 && y < 30000){
//            System.out.println("The variable y contains a positive number");
//        } else {
//            System.out.println("The variable y is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

// --------------------------------------------------------------------------

        //Switch statements
//        String customerChoice = "vanilla";
//
//        switch (customerChoice) {
//            case "vanilla":             //<-- what you are checking for
//                System.out.println("One vanilla coming right up");//<-- output
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("We don't have that");
//                break;
//        }

// --------------------------------------------------------------------------
//        Write each program in a separate class

        //BONUS WORK
//        write a short Java program that tests if a number is positive or negative. Define a few numeric variables and run them through a decision. If the number is positive, output that it is positive, and if it is negative, output that it is negative.
//        int x = 0;
//        if (x > 0){
//            System.out.println("This is a positive number.");
//        }else{
//            System.out.println("Idk bro, might be negative.");
//        }






        //BONUS WORK
//        if you finish early and want a greater challenge, write another Java program that takes a hard-coded number, multiplies it by 2, and determines if the result is less than -100, more than 100, or in between, and tells the user
//        int y = 50;
//
//        if (y > )


//
//    int c = 0, d = 100, e = 50;
//   if( c == 0 && e++ < 100 )
//        {
//        d = 150;
//        }
//        System.out.println("e = " + e );
////none short circuit operator is just one "&" or one "|" for the OR
//
//   int number = 42;
//   boolean exsistence = true;
//
//   if (exsistence || number++ == 42){
//
//   }
//System.out.println(number);

//no === operator , only ==
// just one is = an assignment operator
// inequality operator: !=





//Write a Java Program that asks the user for their age and then tells them if they are a teenager or not.
//BONUS: if not, tell them whether they are younger or older than a teenager.



//        //LOOPS
//
//        int i = 1;      //<-- variable goes outside of loop, then test
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        while (i < 10){     //<--testing the variable, and if true then run everything in code block
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;      //<-- modify loop control variable if not you can get a infinte loop
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        }
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);
//
//
//
//
//
//        //DO While Loop
//        //code block will always run at least once
//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        do {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        } while (i<10);
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);

        //Short hand, but cannot do anything after it evaluates
//        int i;
//        for(int i = 0; i < 10; i++){
//            System.out.println("The loop hasn't started yet. The value of i is " + i);
//        }
//        System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        }





    }
}