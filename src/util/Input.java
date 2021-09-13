package util;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {

//------------------------------------------------------------------------------------------------------------------
    private Scanner scanner;

    public String getString(){
        System.out.println("Please enter a string: ");      //<-- gets input from user
        String userInput = scanner.nextLine();              //<-- captures the input
        return userInput;                                   //<-- displays input
    }
//------------------------------------------------------------------------------------------------------------------

    public boolean yesNo(){
        System.out.println("Please indicate yes or no: ");      //<-- gets input from user
        String yesOrNo = scanner.next();                    //<-- captures the input

        if(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("y"))
            { return true; }
        else
        { return false;}
    }

//------------------------------------------------------------------------------------------------------------------

//    public int getInt(int min, int max){
//
//    }

//    int getInt();
//    double getDouble(double min, double max)




    public double getDouble(String s){
        System.out.println("Enter a number:");
        double userInput = scanner.nextDouble();
        return userInput;
    }


    //When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.
    public Input(){
        this.scanner = new Scanner(System.in);
    }

}
