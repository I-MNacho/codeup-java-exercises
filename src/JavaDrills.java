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
//        System.out.println(flipOuterCase("cat"));//CaT
//        System.out.println(flipOuterCase("CaT"));//cat
//        System.out.println(flipOuterCase("caT"));//Cat
//        System.out.println(flipOuterCase("cAt"));//CAT

        System.out.println(flipInnerCase("cat")); // cAt
        System.out.println(flipInnerCase("CaT")); // CAT
        System.out.println(flipInnerCase("caT")); // cAT
        System.out.println(flipInnerCase("codeup")); // cODEUp
        System.out.println(flipInnerCase("CoDeup")); // COdEUp
    }

//    Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//    returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2

public static void returnTotalDifference(){

}


//    In `codeup-java-exercises`, in`JavaDrills`, add the following:
//    Create a public static method, `flipInnerCase`, that takes in a string and returns the string
//    with the case of all letters reversed EXCEPT for the first and last letters. Assume the input will be three or more characters long.
//    Example inputs and expected outputs...
//  System.out.println(flipInnerCase(“cat”)); // cAt
//  System.out.println(flipInnerCase(“CaT”)); // CAT
//  System.out.println(flipInnerCase(“caT”)); // cAT
//  System.out.println(flipInnerCase(“codeup”)); // cODEUp
//  System.out.println(flipInnerCase(“CoDeup”)); // COdEUp

    //my solution
//public static String flipInnerCase(String str){
//    char[] chars = str.toCharArray();
//
//        for(int i = 1; i < chars.length - 1; i++){
//        char c = chars[i];
//        if(Character.isUpperCase(c)){
//            chars[i] = Character.toLowerCase(c);
//        }else if(Character.isLowerCase(c)){
//            chars[i] = Character.toUpperCase(c);
//        }
//    }
//        return new String(chars);
//}
//    char[] chars = str.toCharArray();
//
//    for(int i = 0; i < chars.length -1; i++){
//        if(Character.isUpperCase(chars[i])){
//            chars[i] = Character.toLowerCase(chars[i]);
//        }else if(Character.isLowerCase(chars[0])){
//            chars[i] = Character.toUpperCase(chars[i]);
//        }
//    }
//    return new String(chars);
//}

//Joseph's Congdon solution
    public static String flipInnerCase(String str){
        char[] chars = str.toCharArray();

        for(int i = 1; i < chars.length - 1; i++){
            char c = chars[i];
            if(Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }











}
