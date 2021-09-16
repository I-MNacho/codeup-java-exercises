package birds;

public class Ornithologist {

    public void changeBirdName(String newBirdName, Bird birdToRename){
        String oldBirdName = birdToRename.getName();
        birdToRename.setName(newBirdName);
        System.out.println("The " + oldBirdName + "'s new name is " + birdToRename.getName());
    }
}
