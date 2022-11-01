public class Main {
    public static void main(String[] args) {
        Person person = new Person("Hasbik", 2);
        Person person2 = new Person("Abdurosik", 5);
        String winner = Game.fight(person, person2);
        System.out.println(winner + " has won the game!");
    }
}
