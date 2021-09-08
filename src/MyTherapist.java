import java.util.Scanner;

public class MyTherapist {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How are you feeling today?");
        String userInput = scanner.nextLine();
        if(userInput == "good"){
            System.out.println("Well it is a gorgeous day in paradise :) ");
        }else if( userInput == "bad"){
            System.out.println("Sometimes even in paradise it has to rain.");
        }
  }
}


//System.out.println("");
