public class FighterTest {
    public static void main(String[] args){
        //we instantiate a fighter object
        Fighter arata = new Fighter();
        arata.name = "Arata";
        arata.hitPoints = 17;
        arata.maxDamage = 14;
        arata.printStats();
        arata.battleRoar();

        Fighter sozalix = new Fighter();
        sozalix.name = "Sozalix";
        sozalix.battleRoar();
        sozalix.printStats();
        System.out.println("Sozalix attacks and rolls a " + sozalix.attackRoll());
        //math objects are useful methods or call methods directly on class itself like with attckRoll
    }


}