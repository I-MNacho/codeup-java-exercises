//TODO: create a class called Product with two private properties of name and priceInCents.
//        Add a public static method called, find average price that takes in an array of products
//        and finds the average price of all products. Add a main method to the class to test some
//        values.



public class ProductTest {

    public static double findAveragePrice(Product[] products){
        double totalPrice = 0;
        for(Product product : products){
            totalPrice += product.getPriceInCents();
        }
        return totalPrice / products.length;
    }


    public static void main(String[] args) {

        Product[] products = new Product[5];
        products[0] = new Product("Milk", 2.19);
        products[1] = new Product("Hot Cheetos", 3.51);
        products[2] = new Product("Hot pockets", 9.89);
        products[3] = new Product("Oat Meal", 1.29);
        products[4] = new Product("Bread", 3.49);
        System.out.println("Average price is: ");
        System.out.printf("$%.2f", findAveragePrice(products));
    }

}
