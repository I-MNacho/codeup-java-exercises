public class MovieTest {

    public static void main(String[] args) {
//        Movie movie = new Movie(null, null);

        Comedy comedy = new Comedy("Unfunny movie", "Mr. Big", false);
        System.out.println(comedy.getName() + " " + comedy.getDirector() + " " + comedy.funny);
    }
}
