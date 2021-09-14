import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjective = {"Ugly", "Soft", "Shiny", "Soft", "Cold", "Dry", "Gooey", "Wet", "Hot", "Hard"};

    private static String[] nouns = {"Car", "House", "Horse", "Couch", "Table", "Dallas", "Cup", "Theater", "Laptop", "Tape"};

    public static String getRandom(String[] array) {
        return array[(int) (Math.random() * array.length)];
    }

    public static void main(String[] args) {
        System.out.printf("Your server name is %n%s%s%s", getRandom(adjective), "-", getRandom(nouns));
    }

}
