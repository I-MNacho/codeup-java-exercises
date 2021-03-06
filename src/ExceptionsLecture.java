import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsLecture {

    public String couldBeAnInteger = "42";
    public String certainlyNotAnInger = "No integer at all.";

//    public void askForAnInteger(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        String userInput = sc.nextLine();
//        try{
//            int userInputInteger = Integer.parseInt(userInput);
//            System.out.println("The integer in your string is " + userInputInteger);
//        }catch(NumberFormatException nfx){
//            System.out.println("Uh oh " + nfx.getMessage() + " there is no integer!");
//        }finally {
//            System.out.println("Thank you for using this complex and useful app.");
//        }

//        public void aMoreComplexAskForInteger(){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter an integer");
//            String userInput = scanner.nextLine();
//            userInput = null;
//            try {
//                //userInput = null;
//                int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
//            } catch (NullPointerException npx){
//                System.out.println("Oops you didn't enter anything");
//                npx.printStackTrace();
//            } catch (IndexOutOfBoundsException iobx) {
//                System.out.println("Oops your string wasn't long enough");
//                iobx.printStackTrace();
//            } catch (NumberFormatException nfx){
//                System.out.println("No integer between chars 10 and 15");
//                nfx.printStackTrace();
//            } finally {
//                System.out.println("That was useful wasn't it?");
//            }
//        }
//
//    public void aMoreComplexAskForInteger(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        String userInput = scanner.nextLine();
//        userInput = null;
//        try {
//            //userInput = null;
//            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
//        } catch (IndexOutOfBoundsException iobx) {
//            System.out.println("Oops your string wasn't long enough");
//            iobx.printStackTrace();
//        } catch (NullPointerException nfx){
//            System.out.println("Oops you didn't enter anything");
//            nfx.printStackTrace();
//        } catch (Exception ex){
//            System.out.println("No integer between chars 10 and 15");
//            ex.printStackTrace();
//        } finally {
//            System.out.println("That was useful wasn't it?");
////        }



//Given the following code, investigate the kinds of exceptions it could throw and write a try-catch structure catching these exceptions and providing the appropriate output messages. Be careful of where exactly you begin your try-catch structure. Optionally, add a finally clause.

//Test your code to make sure that the exceptions are indeed caught. Test the code by entering a null value as the method's String parameter (subListMaker(null) or String sentence = null; subListMaker(sentence)), and by entering negative integers and integers larger than the number of words in the sentence as the user inputs. Try to modify the warning for an improper integer to suggest to the user what range of integers is acceptable.

//To search for what exceptions a method throws, use the following search string: Java + number of your Java JDK + API + name of method. For example, Java 16 API substring.


    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        try {
            String[] stringArray = sentence.split(" ");
            for (String word : stringArray) {
                wordArrayList.add(word);
            }
            List<String> shorterList = wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        }catch (IndexOutOfBoundsException iobe) {
            System.out.println("For that sentence, I need integers between 0 and " + wordArrayList.size());
        } catch (NullPointerException npe){
            System.out.println("This method was not provided with a sentence to operate on");
        }catch(IllegalArgumentException iax){
                System.out.println("I think you just game me numbers in descending order.");
        } finally {
            System.out.println("Thank you!");
        }
    }

//public void echoWord() throws IllegalArgumentException{
//        Scanner sc = new Scanner(System.in);
//    System.out.println("I am a parrot. Please say something so I can parrot you.");
//    String userInput = sc.nextLine();
//    if (userInput.equalsIgnoreCase("curses")){
//        throw new IllegalArgumentException();
//    }
//    System.out.println(userInput);
//    }

    public void echoWord() throws CusswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("I am a parrot. Please say something so I can parrot you.");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("curses")){
            throw new CusswordException("How dare you? We dont allow that sort of language here");
        }
        System.out.println(userInput);
    }


}