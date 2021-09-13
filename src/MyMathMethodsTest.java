public class MyMathMethodsTest {
    public static void main(String[] args) {

//Javiers solution, but the method  was not a static method so we have to instansiate
    MyMathMethods mathMethods = new MyMathMethods();
        System.out.println(mathMethods.multiply(4,5));

//if the multiply method was used as static, this is how we do it.
        MyMathMethods.multiply(5,5);


    }
}

