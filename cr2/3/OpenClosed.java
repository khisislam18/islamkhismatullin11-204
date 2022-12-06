public class OpenClosed {
    public static void method(String string){
        if(string.equals("email")){
            //значит отправляем мейл
        }
        if(string.equals("sms")){
            //значит отправляем смс
        }

        //это плохо, потому что класс будет модернизироваться, а класс должен только расширяться
    }
}
