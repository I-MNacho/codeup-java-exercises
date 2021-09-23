public class MyMathMethods {

    //original method
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }


//1. Overload the multiply method so it takes doubles as well as ints
    public static double multiply(double num1, double num2){
        return num1 * num2;
}

//2. Write a public static method named quotient that works with both integers and doubles (use method overloading) and returns the result of dividing the two passed numbers.
    public static int quotient(int num1, int num2){
        return num1 / num2;
    }

    public static double quotient(double num1, double num2){
        return num1 / num2;
    }

//3. Write a public static method named arraySum that takes in an array of int numbers (not a list, an array), and returns the sum of the numbers.
    public static int arraySum (int[] myNumArray){
        int sum = 0;
        for( int i = 0; i < myNumArray.length; i++ ){
            sum += myNumArray[i];
        }
        return sum;
    }

//4. Create a class called Movie. The class should define two instance variables of type String named name and director. Add a constructor that takes two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters and setters for the instance variables.




//Bonus: If the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException
}