import java.util.Locale;
import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String [] args){
        //problem 1.
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);
        //Problem 2.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);

        //Problem 3.
        //this isn't the way
//        System.out.println("Enter a word: ");
//        String word1 = scanner.nextLine();
//        System.out.println("Enter a word: ");
//        String word2 = scanner.nextLine();
//        System.out.println("Enter a word: ");
//        String word3 = scanner.nextLine();
//        System.out.println("Enter a word: ");

        //Problem 3.

//        System.out.println("Enter three words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//
//        System.out.printf("Your three words were: %s, %s, %s.", word1, word2, word3);
        //How to do a for loop
//        for (int i = 0; i < 3; i++){
//            String userInput = scanner.next();
//            System.out.printf("%s%n", userInput);
//        }



//        Problem 4.

//        System.out.println("Please enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

//        Problem 5.
        System.out.println("Please enter the length of your classroom: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the width of your classroom: ");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("The area of your room is " + (width * length) + " and the perimeter is " + (2 * (width * length)));





    }
}
