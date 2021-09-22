public class MyMathMethodsTest {
    public static void main(String[] args) {

//Javier's solution, but the method  was not a static method so we have to instansiate
    MyMathMethods mathMethods = new MyMathMethods();
//        System.out.println(mathMethods.multiply(4,5));

//if the multiply method was used as static, this is how we do it.
        MyMathMethods.multiply(5,5);

        //testing myArray method in MyMathMethods class
        int[] myArray = {3, 4, 5};
        System.out.println(MyMathMethods.arraySum(myArray));

        //you can test the array by creating the array in the sout...
        System.out.println(MyMathMethods.arraySum(new int[] {3,4,5}));
    }
}

