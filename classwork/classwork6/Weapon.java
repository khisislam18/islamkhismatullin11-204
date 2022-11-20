public class Weapon extends Blade implements Fightable, Cutting{
    int killPotential;
    public Weapon(int killPotential, int sharpness, String material, int length) {
        super(sharpness, material, length);
        this.killPotential = killPotential;
    }

    @Override
    void dangerCheck(){
        if(length < 5){
            System.out.println("Blade isn't dangerous, can be bought w/o license.");
        }else{
            System.out.println("Blade should be bought with license.");
        }
    }

    @Override
    public void testFighting(){
        System.out.println("Blade tested for fighting!");
    }

    @Override
    public void cutTest(){
        System.out.println("Blade cut test completed! Blade has " + limitOfCuts + " overall amount of cuts!");
    }
}