package Task1;

import java.io.IOException;

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

    private String birthDate;

    public Bunny(){}

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

    public boolean getBunnyHungryStatus(){
        return bunnyHungryStatus;
    }

    public String getDecorative() {
        return decorative;
    }
    public void setDecorative(String decorative){
        this.decorative = decorative;
    }

    public boolean isBunnyHungryStatus() {
        return bunnyHungryStatus;
    }

    public int getTrainingSkills() {
        return trainingSkills;
    }

    public String getName() {
        char [] arr = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if((int)arr[i] > 47 && (int)arr[i] < 58){
                throw new IllegalArgumentException("Name can't consist numerical symbols.");
            }
        }
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
        if(bunnyTiredStatus < 1){
            System.out.println(name + " doesn't want to sleep! It's not tired!");
        }else{
            bunnyHungryStatus = false;
            bunnyTiredStatus = 0;
            if(duration > 6){
                trainingSkills -= 1;
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
            trainingSkills += 1;
            bunnyTiredStatus += 1;
        }
    }

    public void passport(){
        System.out.println("\n" + name + "'s passport:\nName: " + name + "\nAge: " + age + "\nFur colour: " + furColour + "\nBorn country: " + bornCountry + "\nSex: " + gender + "\nPeculiarities: " + (decorative == null ? "None" : decorative) + "\n");
    }



    public static Bunny crossBreading(Bunny bunny1, Bunny bunny2, String newName) throws IOException, BunnyException {
            if(bunny1.getGender().equals(bunny2.getGender())){
                throw new IOException("Same-sex bunnies can't reproduce.");
            }

            String [] tmp = new String[]{"male", "female"};
            char [] arr = newName.toCharArray();
            for (int i = 0; i < newName.length(); i++) {
                if((int)arr[i] > 47 && (int)arr[i] < 58){
                    throw new BunnyException("Name can't consist numerical symbols.");
                }
            }
            Bunny bunny = new Bunny(newName,
                    bunny1.getGender().equals("male") ? bunny1.getBornCountry() : bunny2.getBornCountry(),
                    0, bunny1.getFurColour() + " + " + bunny2.getFurColour(),
                    tmp[(int)(Math.random()*tmp.length)],
                    bunny1.getDecorative() != null && bunny2.getDecorative() != null ?  bunny1.getDecorative() + " and " + bunny2.getDecorative() : bunny1.getDecorative() == null ? bunny2.getDecorative() : bunny2.getDecorative() == null ? bunny1.getDecorative() : "None");
            System.out.println("Congrats " + bunny1.getName() + " and " + bunny2.getName() + "! Welcome new bunny in our world: " + newName);
            return bunny;
    }

//    public void implantDecorate(String decorate) throws Task1.BunnyException {
//        try{
//            decorative = implantDecorateNullCheck(decorative, true) + ", " + implantDecorateNullCheck(decorate);
//            System.out.println("Decorate has been added to " + name + ": " + decorative);
//        }catch(NullPointerException e){
//            throw new Task1.BunnyException("Decorate should be not null.", e);
//        }
//    }

//    public static String implantDecorateNullCheck(String decorate) throws Task1.BunnyException {
//        try{
//            int check = decorate.length();
//            return decorate;
//        }catch(NullPointerException e){
//            throw new Task1.BunnyException("Decorate should be not null.");
//        }
//    }
//    public static String implantDecorateNullCheck(String decorate, boolean check) throws Task1.BunnyException {
//        try{
//            int check2 = decorate.length();
//            return decorate;
//        }catch(NullPointerException e){
//            throw new Task1.BunnyException("Task1.Bunny should be decorative.");
//        }
//    }
    public static String implantDecorate(Bunny bunny, String decorate) throws BunnyException {
        try{
            if(decorate == null){
                throw new NullPointerException();
            }
            bunny.setDecorative(bunny.getDecorative() + ", " + decorate);
            return bunny.getDecorative();
        }catch(NullPointerException e){
            throw new BunnyException("Decorate shouldn't be null", e);
        }
    }
}
