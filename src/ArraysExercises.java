import arrayslecture.Person;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    //create scanner
    public static Scanner sc = new Scanner(System.in);

    //create addPerson method
    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[people.length] = newPerson;
        System.out.println();
        return newArray;
    }

    //create main
    public static void main(String[] args) {
        //create new array that holds 3 objects
        Person[] people = new Person[3];
        //objects defined by index number
        people[0] = new Person("Ricky");
        people[1] = new Person("Bobby");
        people[2] = new Person("Brown");
        //iterating through array to display each item
        for (Person person : people) {
            System.out.println(person.getName());
         }
        //ask user for input for new person
        System.out.println("Enter the name of your person: ");
        //capture value
        Person newPerson = new Person(sc.nextLine());
        //run addPerson
        people = addPerson(people, newPerson);
        //capture result and print out new list
        System.out.println("Now the people list is: ");
        //iterate through list and print list
        for(Person person : people){
            System.out.println(person.getName());
        }
    }



}
