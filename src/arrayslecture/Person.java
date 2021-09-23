package arrayslecture;

public class Person {

    private String name;
//    private int age;

//    public static void progressOneYear(Review.Person[] people) {
//        for (Review.Person person : people) {
//            person.setAge(person.getAge() + 1);
//        }
//    }

//    public static void printOutAgesOfPeople(Review.Person[] people) {
//        for (Review.Person person : people) {
//            System.out.println(person.getAge());
//        }
//    }

    public Person(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
//
    public void setName(String name) {
        this.name = name;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

}