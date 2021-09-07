public class ControlFlowExercises {
    public static void main(String [] args) {

//problem 1.
        int i = 5;      //<-- variable goes outside of loop, then test
        System.out.println(i);
        while (i < 15){     //<--testing the variable, and if true then run everything in code block
            i = i + 1;      //<-- modify loop control variable if not you can get a infinte loop
            System.out.println(i);
        }


//Problem 2.
//        int i = 5;
//
//        System.out.println("The value of i is: " + i);
//        do {
//            System.out.println("Value now is: " + i);
//            i = i + 1;
//            System.out.println("i has incremented now and its value is: " + i);
//        } while (i<15);
//        System.out.println("Value will not increment any more, value is: " + i);
//























    }
}
