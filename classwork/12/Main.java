public class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Parrot", "Petya", "Red");
        System.out.println(CheckValueAnnotationValidator.isValid(Animal.class, animal));
    }
}
