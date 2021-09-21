import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsLectureTest {
    public static void main(String[] args) {

        //to catch exceptions use Try and Catch, nfx is number format exception
//        try{
////          access variables
            ExceptionsLecture el = new ExceptionsLecture();
//            System.out.println(Integer.parseInt(el.couldBeAnInteger));
//            System.out.println(Integer.parseInt(el.certainlyNotAnInger));
//        } catch (NumberFormatException nfx) {
//            System.out.println("Got an exception: " + nfx);
//            System.out.println(nfx.getMessage());       //<-- just shows message in certainlyNotAnInteger
//            nfx.printStackTrace();
//        }

//        try{
//            String testString = "this is a string";
//            System.out.println(testString.length());
//            System.out.println(testString.substring(8));
//        }catch(IndexOutOfBoundsException ioobe){
//            System.out.println("Whoa dude, out of bounds!");
//        }



//        el.askForAnInteger();
//        el.aMoreComplexAskForInteger();

//        el.subListMaker("Let's go ahead and work with this sentence, shall we?");

//       try{
//           el.echoWord();
//       }catch (IllegalArgumentException iax){
//            System.out.println("How rude!");
//        }

//        try{
//            el.echoWord();
//        }catch (CusswordException cx) {
//            System.out.println(cx.getMessage());
//        }

        Lizard lizard = new Lizard("Lizard");
        System.out.println(lizard.name);

//        Lizard illegalLizard = new Lizard(null);

        try{
            Lizard illegalLizard = new Lizard("    ");
        }catch (IllegalArgumentException iax){
            System.out.println("That's an illegal lizard, sir. Going to have to take you in.");
        }




        }
    }