import java.util.Scanner;

public class MethodExample1 {

    public static String getInput(){
        //capturing user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input");
        String input = sc.nextLine();
        return input;
    }

    //measuring input length
    public static void printInputLengthMsg(String input){   //<- input type and then name it'
        if (input.length() > 5){
            System.out.println("That is a long input!");
        }else{
            System.out.println("That is not a long input!");
        }
    }


    public static void start(){
        String userInput;       //<-- make sure the variable is defined outside of loop to be able to access it
        do {
            userInput = getInput();
            printInputLengthMsg(userInput);
        } while (userInput.length() < 5);
        System.out.println("End of Program.");
    }




    public static void main(String[] args) {
    start();        //<-- just call the method
//--------------------------------------------------------------------------------------------------

//        String userInput = getInput();      //<-- stores input from user
//        System.out.println(userInput);      //<-- prints out input from user
//--------------------------------------------------------------------------------------------------

//how to ask a user to keep inputting until an input hits 5 characters
//        String userInput;       //<-- make sure the variable is defined outside of loop to be able to access it
//        do {
//            userInput = getInput();
//            printInputLengthMsg(userInput);
//        } while (userInput.length() < 5);
//        System.out.println("End of Program.");
//    }
//--------------------------------------------------------------------------------------------------

        //can do it this way
//        String userInput = getInput();
//        printInputLengthMsg(userInput);


        //OR do it this way
//        printInputLengthMsg(getInput());    //<--the return value of getInput is passed into printInputLengthMsg
//--------------------------------------------------------------------------------------------------


    }
}
