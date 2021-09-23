package Review;

import java.util.Date;

public class Person {

    //state for each person
    private String name;

    //DOB
    private Date dob;

    //SSN
    private String ssn;

    //employment status
    private boolean isEmployed;

    //average income
    private int incomePerYear;

    //Static "Class" variables on a person class?
    static private String homePlanet;
    static private String mostCommonBloodType;
    static private int averageLifeExpectancy;

    //Instance methods
    public void eat(String levelOfPoliteness){
        System.out.println("eating with" + levelOfPoliteness);
    }

    //Static methods
    public double calculateAverageIncomePerYear(Person[] people){
        return 0.0;
    }

    //find most common blood type is another example of a static method





}
