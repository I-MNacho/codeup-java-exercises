package AbstractClassAndInterface;

public class MediaTest {
    public static void main(String[] args) {

        //newspaper
        Media newspaper = new Newspaper();
        newspaper.checkOut();
        newspaper.canCheckout();
        newspaper.paper();

        System.out.println("");

        //magazine
        Media magazine = new Magazines();
        magazine.checkOut();
        magazine.canCheckout();
        magazine.ewPaper();





    }
}
