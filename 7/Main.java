public class Main {
    public static void hungryStatus(Bunny bunny){
        if(bunny.getBunnyHungryStatus()){
            System.out.println(bunny.getName() + " is not hungry and it's happy! :)");
        }else{
            System.out.println(bunny.getName() + " is hungry! Feed him right now! >:(");
        }
    }
    public static void main(String[] args) {
        Bunny bunny = new Bunny("Matilda", "Russia", 5, "black", "female");
        Bunny bunny1 = new Bunny("Michu", "Australia", 3, "white", "male");
        Bunny bunny2 = new Bunny("Bizzy", "Poland", 1, "black", "female", "big round tale");
        Bunny bunny3 = new Bunny("Azat", "Tatarstan", 5, "red", "male", "big head");
        bunny.feed();
        hungryStatus(bunny);
        bunny.training();
        hungryStatus(bunny);
        bunny.play();
        hungryStatus(bunny);
        bunny.training();
        bunny.sleep(5);
        bunny1.feed();
        hungryStatus(bunny1);
        bunny1.training();
        hungryStatus(bunny1);
        bunny1.play();
        hungryStatus(bunny1);
        bunny1.training();
        bunny1.sleep(1);
        Bunny bunny4 = Bunny.crossBreading(bunny1, bunny2, "Litcked");
        hungryStatus(bunny4);
        bunny4.feed();
        hungryStatus(bunny4);
        bunny4.training();
        hungryStatus(bunny4);
        System.out.println(bunny4.getName() + " has " + bunny4.getTrainingSkills() + " strength points!");
        bunny4.play();
        System.out.println(bunny4.getName() + " has " + bunny4.getTrainingSkills() + " strength points!");
        hungryStatus(bunny4);
        bunny4.training();
        bunny4.training();
        bunny4.training();
        bunny4.training();
        bunny4.training();
        bunny4.sleep(5);
        bunny4.training();
        bunny.passport();
        bunny1.passport();
        bunny2.passport();
        bunny3.passport();
        bunny4.passport();
        Bunny.crossBreading(bunny1, bunny3, "Mischief");
    }
}
