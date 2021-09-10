public class SharkTest {
    public static void main(String[] args){
        Shark greatWhite = new Shark("Great White", "arrrhhhh", 50);
        Shark orca = new Shark("Orca", "ooooowwwww", 44);
//        shark.name = "Great White";
//        shark.sound = "Chomp Chomp Arr Arr Rahh Rahh";
//        shark.eat = 20;
//        shark.makeNoise();
//        shark.visitsYoGranny();
//        shark.visitsYoGranny();
//        shark.visitsYoGranny();
//        System.out.println( shark.name + " attacks and eats " + Shark.randomQuote() + " Twilight fans and we hear in the distance " + Shark.screamHeard());

        orca.setSound("dudum dudum here I come!");
        orca.setGrannysEaten(5);
        System.out.println("Orca says " + orca.getSound() + " and ate " + orca.getGrannysEaten() + " grannies.");

    }
}
