public class Game {
    public static String fight(Person person, Person person2){
        while(true){
            person.hit(person2);
            System.out.println(person.name + " has " + person.hp);
            if(person.hp <= 0){
                break;
            }
            person2.hit(person);
            System.out.println(person2.name + " has " + person2.hp);
            if(person2.hp <= 0){
                break;
            }
        }
        return person.hp <= 0 ? person2.name : person.name;
    }
}
