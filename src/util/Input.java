package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public String getString(){
        System.out.println("Please enter a string: ");      //<-- gets input from user
        String userInput = scanner.nextLine();              //<-- captures the input
        return userInput;                                   //<-- displays input
    }

//    boolean yesNo();
//    int getInt(int min, int max);
//    int getInt();
//    double getDouble(double min, double max)
//    double getDouble()






    //When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.
    public Input(){
        this.scanner = new Scanner(System.in);
    }

}
