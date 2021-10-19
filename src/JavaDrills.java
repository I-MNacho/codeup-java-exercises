//In `codeup-java-exercises`, create a class `JavaDrills`, with the following:
//Create a public static method, `flipOuterCase`, that takes in a string and returns the string
//with the case reversed for the first and last letters. Assume the input will be three or more characters long.
public class JavaDrills {

//    work in progress
    public static String flipOuterCase(String str){

        char[] chars = str.toCharArray();

        for(int i =0; i < chars.length; i++){
            if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }else if(Character.isLowerCase(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }


    public static void main(String[] args) {
        System.out.println(flipOuterCase("cat"));//CaT
        System.out.println(flipOuterCase("CaT"));//cat
        System.out.println(flipOuterCase("caT"));//Cat
        System.out.println(flipOuterCase("cAt"));//CAT
    }

//    Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//    returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2

public static void returnTotalDifference(){

}

}