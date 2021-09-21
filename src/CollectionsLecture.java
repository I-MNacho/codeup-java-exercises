import java.util.*;

public class CollectionsLecture {
    public static void main(String[] args) {

        //creating ArrayLists
        ArrayList<Integer> numbers = new ArrayList<>();

        //the angle brackets <>  is called a java generic, will hold everything of the same type, call with reference type instead of primitive type
        //EX:
        //<Integer>
        //<Boolean>
        //<String>

        //this is how we can add to an array list
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);

        //if we want to replace an element with a certain index use set. first value is index and next value is value we want to use
//        numbers.set(0, 5);

//        System.out.println(numbers);

        //this will print out the first index and print out 1
//        int number = numbers.get(0);
//        System.out.println(number);

        //for loop, prints out the same as array list
//        for (Integer number : numbers){
//            System.out.println(number);
//        }

        //adding an array list of names or strings
//        List<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));

//        System.out.println(names);


//        remove elements
//            names.remove(0);
//            names.remove("Cindy");


        //to find length we use .size() instead of .length for arrays

//        --------------------------------------- Array Lists ----------------------------------------------------

//        //reordering list
//        Collections.sort(numbers);
//        Collections.reverse(numbers);
//        System.out.println(numbers);
//
//        // info about list and getting elements
//        System.out.println(numbers.size());
//        System.out.println(numbers.indexOf(3));
//        System.out.println(numbers);
//        System.out.println(numbers.indexOf(105));
//
//        //list of strings
//        ArrayList<String> roasts = new ArrayList<>();
//        roasts.add("medium");
//        roasts.add("light");
//        roasts.add("medium");
//        roasts.add("dark");
//        System.out.println(roasts);
//        System.out.println(roasts.contains("dark"));
//        System.out.println(roasts.contains("espresso"));
//        System.out.println(roasts.lastIndexOf("medium"));
//        System.out.println(roasts.isEmpty());


//        --------------------------------------- Hash Maps ----------------------------------------------------

//        //creating has maps
//        HashMap<String, String> usernames = HashMap<>();
//        usernames.put("Ryan", "ryanorsinger");
//        usernames.put("Fernando", "fmendozaro");
//        usernames.put("Luis", "MontealegrLuis");
//
//        //getting values from and info about hash maps
//        System.out.println(usernames.get("Justin"));
//        System.out.println(usernames);
//        System.out.println(usernames.get("Phillip"));       //<-- gets you null since it doesnt exist in array
//        System.out.println(usernames.getOrDefault("Fred", "gocodeup"));     //<-- gives you what you want to output
//
//
//        //updating hash maps
//        usernames.putIfAbsent("Zach", "Coderdude24");
    }
}
