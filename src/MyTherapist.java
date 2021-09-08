import java.util.Scanner;

public class MyTherapist {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How are you feeling today?");
        String userInput = scanner.nextLine();
        if(userInput.equals("good")){
            System.out.println("Well it is a gorgeous day in paradise :) ");
        }else if(userInput.equals("bad")){
            System.out.println("Sometimes even in paradise it has to rain.");
        }
  }
}















//.contains()       <-- allows you to look for anything you want in a response
