package AbstractClassAndInterface;

public class Magazines extends Media {

public void paper(){
    System.out.println("this isnt newspaper");
}
    @Override
    public void checkOut() {
        System.out.println("Who reads these anymore?");
    }

    public void ewPaper(){
        System.out.println("Magazines are so 90's");
    }

}
