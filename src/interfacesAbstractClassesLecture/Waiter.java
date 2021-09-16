package interfacesAbstractClassesLecture;

public class Waiter extends Employee{

    @Override
    public String doWork() {
        return "Serving the guests...";
    }

    public static void main(String[] args) {
        //create waiter
//        Waiter waiter = new Waiter();
//        System.out.println(waiter.doWork());


        //can we create a employee of type Employee?  A:no

        //can we create an employee of type waiter?
//        Waiter w = new Employee();     no does not work

        //Can we create a waiter of type Waiter? A: yes
//        Waiter waiter = new Waiter();

        //Can we create a waiter of type Employee? A: yes
        Employee waiter = new Waiter();
        Employee developer = new Developer();

        Employee[] employees = {waiter, developer};
        employeesDoWork(employees);

        //Q: Out of the four pillars of OOP, what does this best demonstrate?
        //abstraction, inheritance, polymorphism, encapsulation...?
        //A:

    }

    public static void employeesDoWork(Employee[] employees){
        for (Employee e : employees){
            System.out.println(e.doWork());
        }
    }
}
