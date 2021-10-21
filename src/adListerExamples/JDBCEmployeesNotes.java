//will only work with employees database
//
//import com.mysql.cj.jdbc.Driver;
//
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class JDBCEmployees {
//    public static void main(String[] args) {
//
//        // register driver
//        try {
//            // Register Driver
//            DriverManager.registerDriver(new Driver());
//
//            // Create connection
//            Connection connection = DriverManager.getConnection(        //has three parameters, (url, DB username, DB password)
//                    //DB url
//                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
//                    //DB username
//                    "root",
//                    //DB password
//                    "codeup"
//            );
//
//            //create statement
//            Statement statement = connection.createStatement();
//
//
//            // (Select) execute the query with statement
//            ResultSet resultSet =  statement.executeQuery("SELECT * FROM employees LIMIT 10");
//
//            // scroll through ResultSet to print out first 10 employee first names
//            //prints out the first 10 names with while loop and LIMIT set to 10
//            List<String> firstNames = new ArrayList<>();
//            //refactor to add names to array list
//            while(resultSet.next()){
//                String firstName = resultSet.getString("first_name");
//                firstNames.add(firstName);
//            }
//
//            System.out.println(firstNames);
//
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//}