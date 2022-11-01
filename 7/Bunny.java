import java.io.IOException;
import java.util.Objects;

public class Bunny {
    private String name;
    private String bornCountry;
    private int age;
    private String furColour;
    private String gender;

    private String decorative;
    private boolean bunnyHungryStatus;
    private int bunnyTiredStatus;
    private int trainingSkills;

    public Bunny(String name, String bornCountry, int age, String furColour, String gender) {
        this.name = name;
        this.bornCountry = bornCountry;
        this.age = age;
        this.furColour = furColour;
        this.gender = gender;
        trainingSkills = 1;
        bunnyTiredStatus = 0;
    }

    public Bunny(String name, String bornCountry, int age, String furColour, String gender, String decorative) {
        this(name, bornCountry, age, furColour, gender);
        this.decorative = decorative;
        trainingSkills = 1;
        bunnyTiredStatus = 0;
    }

    public int getBunnyTiredStatus() {
        return bunnyTiredStatus;
    }

    public void setBunnyTiredStatus(int bunnyTiredStatus) {
        this.bunnyTiredStatus = bunnyTiredStatus;
    }

    public boolean getBunnyHungryStatus(){
        return bunnyHungryStatus;
    }
    public void setBunnyHungryStatus(boolean bunnyHungryStatus) {
        this.bunnyHungryStatus = bunnyHungryStatus;
    }

    public void setTrainingSkills(int trainingSkills) {
        this.trainingSkills = trainingSkills;
    }

    public String getDecorative() {
        return decorative;
    }

    public boolean isBunnyHungryStatus() {
        return bunnyHungryStatus;
    }

    public int getTrainingSkills() {
        return trainingSkills;
    }

    public String getName() {
        return name;
    }

    public String getBornCountry() {
        return bornCountry;
    }

    public int getAge() {
        return age;
    }

    public String getFurColour() {
        return furColour;
    }

    public String getGender() {
        return gender;
    }

    public String isDecorative() {
        return decorative;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBornCountry(String bornCountry) {
        this.bornCountry = bornCountry;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFurColour(String furColour) {
        this.furColour = furColour;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDecorative(String decorative) {
        this.decorative = decorative;
    }

    public void feed(){
        if(bunnyTiredStatus > 2){
            System.out.println(name + " is so tired! It wants to sleep!");
        }else{
            String[] food = new String[] {"carrot", "cabbage", "apple", "beet"};
            System.out.println(name + " has just eaten tasty " + food[(int)(Math.random()*food.length)] + "! " + name + " is not hungry for now!");
            bunnyHungryStatus = true;
            bunnyTiredStatus += 1;
        }
    }


    public void training(){
        if(bunnyTiredStatus > 2){
            System.out.println(name + " is so tired! It wants to sleep!");
        }else{
            trainingSkills += 1;
            if(age > 3){
                System.out.println("Despite of old age, " + getName() + " is keeping himself in shape! +1 for training skills!");
            }else{
                System.out.println("Young forever! " + getName() + " has did some exercises! +1 for training skills!");
            }
            bunnyHungryStatus = false;
            bunnyTiredStatus += 1;
        }
    }
    public void sleep(int duration){
        if(bunnyTiredStatus < 2){
            System.out.println(name + " doesn't want to sleep! It's not tired!");
        }else{
            bunnyHungryStatus = false;
            bunnyTiredStatus = 0;
            if(duration > 6){
                trainingSkills += 1;
                System.out.println(name + " is overslept! -1 for training skills!");
            }else{
                System.out.println("Good morning, " + name + ". It slept very well!");
            }
        }
    }
    public void play(){
        if(bunnyTiredStatus > 2){
            System.out.println(name + " is so tired! It wants to sleep!");
        }else{
            String[] game = new String[] {"football", "hunting", "jumping", "fighting"};
            System.out.println(name + " has just played " + game[(int)(Math.random()*game.length)] + "! " + name + " really liked it!");
            bunnyHungryStatus = false;
            trainingSkills -= 1;
            bunnyTiredStatus += 1;
        }
    }

    public static Bunny crossBreading(Bunny bunny1, Bunny bunny2, String newName) {
            if(bunny1.getGender().equals(bunny2.getGender())){
                throw new IllegalArgumentException("Same-sex bunnies can't reproduce.");
            }
            String [] tmp = new String[]{"male", "female"};
            Bunny bunny = new Bunny(newName, bunny1.getGender().equals("male") ? bunny1.getBornCountry() : bunny2.getBornCountry(), 0, bunny1.getFurColour() + " + " + bunny2.getFurColour(), tmp[(int)(Math.random()*tmp.length)]);
            System.out.println("Congrats " + bunny1.getName() + " and " + bunny2.getName() + "! Welcome new bunny in our world: " + newName);
            return bunny;
    }
}
