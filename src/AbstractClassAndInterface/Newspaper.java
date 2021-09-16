package AbstractClassAndInterface;

public class Newspaper extends Media {

    @Override
    public void checkOut() {
        System.out.println("You for sure can check this out!");
    }

    public void paper(){
        System.out.println("Feel the paper goodness");
    }

    public void ewPaper(){};


}

