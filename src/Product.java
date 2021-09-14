//TODO: create a class called Product with two private properties of name and priceInCents.
//        Add a public static method called, find average price that takes in an array of products
//        and finds the average price of all products. Add a main method to the class to test some
//        values.
public class Product {
//private variables
    private String name;
    private double priceInCents;


    //constructor
    public Product(String name, double priceInCents){
        this.name = name;
        this.priceInCents = priceInCents;
    }


//instance methods
    public void printDetails(){
        System.out.printf("The product name is: %s%n the Product price is: $%.2f",
                this.name,
                this.priceInCents / 100.0);
    }

    //static methods
//    public static double findAveragePrice(Product[] products){
//        int totalPrice = 0;
//        for(Product product : products){
//            totalPrice += product.getPriceInCents();
//        }
//        return totalPrice / products.length;
//    }


//getters and setters
    public String getName() {
        return name;
    }


    public double getPriceInCents() {
        return priceInCents;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPriceInCents(double priceInCents) {
        this.priceInCents = priceInCents;
    }
}