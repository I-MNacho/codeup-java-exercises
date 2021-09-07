import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String [] args) {

//problem 1.a While
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i ++;
//        }


//1b
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i = i + 2;
//        } while (i <= 100);


//Problem 2. Do-While. 2.
//        int i = 100;
//        do {
//            i = i - 5;
//            System.out.println(i);
//        } while ( i>= -10);


//Problem 2. Do-While. 3.
//        long i = 2;
//        do {
////            System.out.println("Value now is: " + i);
//            i = i * i;
//            System.out.println("i has decremented now and its value is: " + i);
//        } while (i< 65536);


//Problem 2. Do-While. C.
//    int i;
//    for(i = 5; i < 15; i++){
//        System.out.print(i + " ");
//    }
//    System.out.print("Loop is done and the value now is: " + i);
//
//
//for (int i =0; i <= 100; i+=2){
//    System.out.println(i);
//}
//
//for (int i = 100; i >+ -10; i -=5){
//    System.out.println(i);
//        }

//        for (long i = 2L; i <= 1000000; i *=i){
//            System.out.println(i);
//        }


//        Shelby's brother solution
//        for (int i = 1; i <= userInput; i++) {
//            System.out.printf("%-7d| %-8d| %-5d%n", i, i*i, i*i*i);
//        }



        //Fizz Buzz Solution

//for (int i =1; i <= 100; i++){
//    if(i % 3 == 0 && i % 5 == 0){
//        System.out.println("Fizz Buzz");
//    }else if (i % 3 == 0){
//        System.out.println("Fizz"); }
//    else if (i % 5 == 0){
//        System.out.println("Buzz");
//    } else {
//        System.out.println(i);
//    }
//    }
//    }


        //Kristen's solution
//        int i = 1;
//        while (i < 100) {
//            if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("FizzBuzz");
//            }else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
////            System.out.println("FizzBuzz");
////            System.out.println("Fizz");
////            System.out.println("Buzz");
//
//            i++;
//        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");
        int userInput = scanner.nextInt();
        System.out.println("");
        System.out.println("Here is your table!");
        System.out.println("");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i =1; i <= userInput; i++){
            System.out.printf("%-7d| %-8d| %-5d%n", i, i*i, i*i*i);
        }








    }}


