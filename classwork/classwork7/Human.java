public class Human {
    private String name;
    class Legs{
        public static String status = "broken";
        static{
            System.out.println("Initializing human legs.");
        }
        {
            System.out.println("Human legs configuration.");
        }
    }
}
