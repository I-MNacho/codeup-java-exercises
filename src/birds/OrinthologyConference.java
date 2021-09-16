package birds;

public class OrinthologyConference {

    public static void main(String[] args) {
        Ornithologist drKook = new Ornithologist();
        Bird broadWingedHawk = new Bird(":Broad-Winged Hawk");
        drKook.changeBirdName("Sharp-eyed hawk", broadWingedHawk);
    }
}
