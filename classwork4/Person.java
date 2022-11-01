public class Person {
    public String name;
    public int strength;
    public int hp;
    public Person(String name, int strength){
        hp = 30;
        this.name = name;
        this.strength = strength;
    }
    public void hit(Person person){
        double hitProc = (11 - strength) * 0.1;
        if(Math.random() < hitProc){
            person.hp -= strength;
        }
    }
}
