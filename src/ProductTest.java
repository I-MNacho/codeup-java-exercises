//TODO: create a class called Product with two private properties of name and priceInCents.
//        Add a public static method called, find average price that takes in an array of products
//        and finds the average price of all products. Add a main method to the class to test some
//        values.
//import java.Product;


public class ProductTest {

    public static double findAveragePrice(Product[] products){
        int totalPrice = 0;
        for(Product product : products){
            totalPrice += product.getPriceInCents();
        }
        return totalPrice / products.length;
    }


    public static void main(String[] args) {

        Product[] products = new Product[5];
        products[0] = new Product("Milk", 219);
        products[1] = new Product("Hot Cheetos", 351);
        products[2] = new Product("Hot pockets", 320);
        products[3] = new Product("Oat Meal", 129);
        products[4] = new Product("Bread", 349);
        System.out.println("Average price is: ");
        System.out.printf("$%.2f", findAveragePrice(products));

    }




}
