package Review;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;

public class Review {


//  Quick, top-level overview of Java I and II


//   Loops: Do whiles
//    iterates until some condition is met
//why do while vs while?
//-more flexible
//will run at least once (the "do" block of code)

//print out numbers 1 - 10.
//    int i = 0;
//    do{
//        //always will run
//        i++;
//        System.out.println(i);
//    }while (i < 10);







//Java I

//    how Java works
//
//Basic syntax (types)
//   -primative vs reference types
//
//Console IO
//      -How to get input from the user with scanner
//      -Output info to user(printf)

//Control Statements and Loops
//    if / else if
//    do / while
//    while
//    for
//    switch case
//    ternary
//    Strings
//        -how to compare string types

//Strings
//    -how to compare string types
//    -equals()
//    -equalsIgnoreCase()

//Methods
//    -break Java code up into various methods
//    -recursion(Where a method calls itself)
//    method overloading - same method name/ different parameters
//
//
//
//    -- JAVA II
//
//OOP
//     -How to break apart code in an object oriented-way
//     -how classes can be defined as a blueprint for objects
//     -Visibility (public/protected/private) / Encapsulation
//           -defining the "gate keepers" explicitly creating getter and setter methods
//     -Four pillars of OOP (Abstraction, Inheritance, Polymorphism, Encapsulation)
//     -Instantiation - make objects
//     -Static vs Instance
//           -Obj.doSomething() // don't have to use the 'new' keyword
//           -Obj.doSomething() // had to use the 'new' keyword
//    EX:
//
//    Review.Person tom = new Review.Person();
//    tom.walkAround(); // <-- instance method

//    Review.Person.findOldestPerson(Review.Person[] people); // static method

//Static / "Class" the method and variables that belong to the class
//Instance / belong to the object

//    Instance methods / variables require an object be made to use them

//    Static does not require the creation of an object

//---------------------------------------------------------------------------------------------------------
//Arrays
//    A way of keeping track of a group of values of the same type
//    Compared to ArrayList
//        -"harder" to work with - can't change array length (are fixed in length)
//        - arrays can hold primative values
//        - can be faster

    //create an array of four strings in an array
    //create new array
String[] strs = new String[4];
    //define each index
//    strs[0] = "one";
//    strs[1] = "two";
//    strs[2] = "three";
//    strs[3] = "four";

//    System.out.println(Arrays.toString(strs));

//    String[] strs = {
//
//    }






//---------------------------------------------------------------------------------------------------------
//Inheritance and Polymorphism

//  -Inheritance
//  -super keyword
//---------------------------------------------------------------------------------------------------------
//  -Polymorphism
//  -Method overriding - replacing the default version of the inherited method




//---------------------------------------------------------------------------------------------------------
//Interfaces and Abstract Classes
//      -when you have to share common state and behavior across subtypes, use an abstract method
//      -when you have to share common behavior use an interface



//---------------------------------------------------------------------------------------------------------
//Collections
//    -Frame work for various classes and interfaces to extending / implementing your own colleciton types.
//    -Some collection implementations, we focused on ArrayList and HashMap

//            Lists  vs  HashMaps

//            List of elements vs key - value pairs

//        String ssn1 = "2322";
//        String ssn2 = "2342";
//        String ssn3 = "1234";
//
//        //create hashmap, values are accessed by key value
//        HashMap<String, Person> people = new HashMap<>();
//
//        people.put(ssn1, new Person());
//        people.put(ssn2, new Person());
//        people.put(ssn3, new Person());
//
//        System.out.println(people);
//
//        System.out.println(people.get(ssn1));



//---------------------------------------------------------------------------------------------------------
//Annotations
//    -Things with @
//    -@override
//    -Will return in upcoming lessons

//Exceptions and Error Handling
//    -Unchecked vs Checked Exceptions
//    -How to handle an exception:
//        1.Try/catch
//        2.Throws


//File IO
//    -how to read and write text files
//    -Create files and directories







}
