import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
        Path pathToOurDataDir = Paths.get("src/data");                      //<-- creating a directory
////        System.out.println(pathToOurDataDir);
//       try{
//           Files.createDirectories(pathToOurDataDir);
//       } catch (IOException ioe){                                       //<-- have to catch the exception before creating the file of data
//           ioe.printStackTrace();
//       }
//
//
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
//           Files.write(pathToOurFile, imperials);
//       }catch (IOException ioe){
//           ioe.printStackTrace();                       //<-- if we do get an io exception we print stacktrace();
//       }
//
//    }

//        List<String> currentList = new ArrayList<>();
//        try {
//            currentList = Files.readAllLines(pathToOurFile);//<--variables has to be of type list , the variable you create to capture value                                                                //from readAllLines
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//        for (String item : currentList) {
//            System.out.println(item);
//        }

        FileIOLecture fiol = new FileIOLecture();
        fiol.readFileAndOutput(pathToOurFile);

        try{
            Files.writeString(pathToOurFile, "MessaLina\n", StandardOpenOption.APPEND);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        fiol.readFileAndOutput(pathToOurFile);


    }
}
