//will only work with employees database
//
//import java.sql.*;
//import com.mysql.cj.jdbc.Driver;
//public class JDBCTest {
//
//    public static void main(String[] args) {
//        try {
//            // Register Driver
//            DriverManager.registerDriver(new Driver());
//
//            // Create connection
//            Connection connection = DriverManager.getConnection(        //has three parameters, (url, DB username, DB password)
//                    //DB url
//                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
//                    //DB username
//                    "root",
//                    //DB password
//                    "codeup"
//            );
//
//            // Create statement
//            Statement statement = connection.createStatement();
//
//
//            // (Select) execute teh query with statement
//            ResultSet resultSet =  statement.executeQuery("SELECT * FROM albums");
//
//            //.next() method allows us to scroll through the DB of albums
////            resultSet.next();
//            //the more .next() I add, the lower the cursor goes per next()
////            resultSet.next();
////            resultSet.next();
//
//            //setting variables to instances of that type
////            if(resultSet.next()){
////                String firstArtist = resultSet.getString("artist");
////                String firstAlbum = resultSet.getString("name");
////                System.out.println(firstArtist);
////                System.out.println(firstAlbum);
////            }
//            //
//            while(resultSet.next()){
//                System.out.println(resultSet.getString("name"));
//            }
//
//            //creating variables that use getString to grab values of either the title of column or using the index
////            String firstArtist = resultSet.getString(2);
////            String firstAlbum = resultSet.getString("name");
//
////            System.out.println(firstArtist);
////            System.out.println(firstAlbum);
//            // Scroll through ResultSet to print album artists
//
//
//        }catch (SQLException throwables){
//            throwables.printStackTrace();
//        }
//
//    }
//
//}
