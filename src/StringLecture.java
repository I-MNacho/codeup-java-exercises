import java.util.Scanner;

public class StringLecture {
    public static void main(String[] args) {
        //do not compare strings in Java with comparison operator
        //use the comparison operator == for primitive variables


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = scanner.next();
        //do not do this!!
//        if (userInput == "Justin") {
//            System.out.println("The user entered the string 'Justin'");
//        } else {
//            System.out.println("The user did not enter the string 'Justin'");
//        }
        String justin = "Justin";
        if (userInput.equals(justin)) {
            System.out.println("The user entered the string 'Justin'");
        } else {
            System.out.println("The user did not enter the string 'Justin'");
        }








    }
}