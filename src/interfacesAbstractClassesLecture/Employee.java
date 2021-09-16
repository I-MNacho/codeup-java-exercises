package interfacesAbstractClassesLecture;

abstract public class Employee {

    //abstract method, does not have a body and cannot.
    public abstract String doWork();

    //can still have regular methods in an abstract class.
    public void somethingElse(){
        System.out.println("Something else");
    }

    //
    public void quit(){
        System.out.println("I quit!!");
    }

    public void onboardWithEmployer(){
        System.out.println("On boarding");
    }
}
