import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FileIOLectureTest {
    public static void main(String[] args) {
//
        Path path = Paths.get("src");   //<--takes in a string
//        System.out.println(path);       //<-- prints out "src", which is just the path
//        System.out.println(path.toAbsolutePath());  //<-- prints out the actual path from Users down to src
//
//        Path pathToThisLectureFile = Paths.get("src", "FileIOLecture.java");    //<--can give it another file name that you want                                                                                            //inside the directory to the left ("src")
//        System.out.println(pathToThisLectureFile);                              //<-- just shows path to this current file
//
//
//        Path pathToOurDataDir = Paths.get("src/data");                      //<-- creating a directory
//        System.out.println(pathToOurDataDir);
//       try{
//           Files.createDirectories(pathToOurDataDir);
//       } catch (IOException ioe){                                       //<-- have to catch the exception before creating the file of data
//           ioe.printStackTrace();
//       }
//
//-----------------------    -----------------------    -----------------------    -----------------------    -----------------------
        Path pathToTestDir = Paths.get("src/test");
//       try{
//           if(Files.notExists(pathToOurDataDir)){
//               Files.createDirectories(pathToTestDir);
//           } else{
//               System.out.println("The " + pathToOurDataDir + " directory already exists!");
//           }
//       }catch(IOException ioe){
//           ioe.printStackTrace();
//       }

//        -------------------------------------------------------------------------------------------------------------------
                //creating a list.txt file but catches errors
        Path pathToOurFile = Paths.get("src/data", "list.txt");
//       try{
//           if(Files.notExists(pathToOurFile)){
//               Files.createFile(pathToOurFile);
//           }else {
//               System.out.println("The " + pathToOurFile + " file already exists!");
//           }
//       }catch (IOException ioe){
//           System.out.println("There was a problem!");
//           ioe.printStackTrace();
//       }
//
//        List<String> imperials = Arrays.asList("Augustus", "Livia", "Agrippina", "Claudius");
//       try{
//           Files.write(pathToOurFile, imperials);             //<--we can write our list to this file by using Files.write(filename, listToBeAdded)
//       }catch (IOException ioe){
//           ioe.printStackTrace();                       //<-- if we do get an io exception we print stacktrace();
//       }

//    }
//        ------------------------------------------------------------------------------------------------------------------------------------------
        List<String> currentList = new ArrayList<>();
//        try {
//            currentList = Files.readAllLines(pathToOurFile);                  //<--variables has to be of type list , the variable you create to capture value                                                                                                                                         //from readAllLines
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//        for (String item : currentList) {                             //<--loop through list and output that value
//            System.out.println(item);
//        }
//        ------------------------------------------------------------------------------------------------------------------------------------------
                FileIOLecture fiol = new FileIOLecture();
//        fiol.readFileAndOutput(pathToOurFile);

        //add one item to the list, using Files.writeString(), you have to add \n  to do it, then you have to have StandardOpenOption.APPEND at the end.
//        try{
//            Files.writeString(pathToOurFile, "MessaLina\n", StandardOpenOption.APPEND);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        fiol.readFileAndOutput(pathToOurFile);
//        ------------------------------------------------------------------------------------------------------------------------------------------
                //add another whole list to the current list
        //create list first
        List<String> lateImperials = new ArrayList<>();
        lateImperials.add("Galla Placidia");
        lateImperials.add("Theodora");
        lateImperials.add("Licinia Eudoxia");

//        try{
//            Files.write(pathToOurFile, lateImperials, StandardOpenOption.APPEND);       //<--same as adding MessaLina but a whole list
//        }catch(IOException ioe){
//            ioe.printStackTrace();
//        }
//        fiol.readFileAndOutput(pathToOurFile);


//------------------------------------------------------------------------------------------------------------------------------------------
        //how to remove/delete items from list
        //iterate list and during iteration, modify it

//        List<String> currentList = new ArrayList<>();
        try{
            currentList = Files.readAllLines(pathToOurFile);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        Iterator<String> listIterator = currentList.iterator();     //<--
        while (listIterator.hasNext()){
            String item = listIterator.next();                      //<--next element in iteration and stored under item as a string
            if (item.equalsIgnoreCase("Claudius")){
                listIterator.remove();
            }
        }
        //haven't written the results to the text file yet so this is how...
        try{
            Files.write(pathToOurFile, currentList);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        fiol.readFileAndOutput(pathToOurFile);




    }
}
