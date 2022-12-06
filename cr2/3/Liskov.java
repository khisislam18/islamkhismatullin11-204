public class Liskov {
    public static void beep(){
        System.out.println("beep");
    }
    static class NewCar{
        public static void beep(){
            System.out.println("New beep????");
        }
    }
    //ЭТО ОЧЕНЬ ПЛОХО, метод не должен переопределяться, если родительский класс не тронут, они дожны отдельно определяться клиентом, клиенту не нужен бип ньюкара если у него его нет
}

