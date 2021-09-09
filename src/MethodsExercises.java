import java.util.Scanner;

public class MethodsExercises {
            public static void main (String[] args) {
//----------------------------------------------------------------------------------------------------------------------
//Problem 1.a.
//                Addition(3, 5);
//                Subtraction(3,5);
//                Multiplication(3, 5);
//                Division(6, 3);
//                Modulus(6, 4);
//
//----------------------------------------------------------------------------------------------------------------------
//Problem 2.
//                getInteger(1, 10);
//----------------------------------------------------------------------------------------------------------------------
//Problem 3.
                    Factorials(1, 10);
            }


//----------------------------------------------------------------------------------------------------------------------
//Problems 1.a.
        public static int Addition(int num1, int num2){
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
            return sum;
        }

         public static int Subtraction(int num1, int num2){
             int total = num1 - num2;
             System.out.println("The result of your subtraction is: " + total);
             return total;
         }

         public static int Multiplication (int num1, int num2){
             int total = num1 * num2;
             System.out.println("The result of your multiplication is: " + total);
             return total;
         }

         public static int Division (int num1, int num2){
             int total = num1 / num2;
             System.out.println("The result of your division is: " + total);
             return total;
         }
         public static int Modulus (int num1, int num2){
             int total = num1 % num2;
             System.out.println("The remainder is: " + total);
             return total;
         }
//----------------------------------------------------------------------------------------------------------------------
//Problem 2.
    public static int getInteger(int num1, int num2){
        System.out.print("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if(userInput < num1 || userInput > num2){
            getInteger(1, 10);
        }else{
            System.out.println("You typed in: " + userInput + " your number is in between " + 1 + " and " + 10);
        }
        return userInput;
    }

    public static int Factorials (int num1, int num2) {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();


        if (num1 == 1) return 1;
        return Factorials(num1 - 1) + num1;




        if (userInput < num1 || userInput > num2) {
            Factorials(1, 10);
        }else{
//            System.out.println("nah bro");
        }
        return userInput;
    }















    }
