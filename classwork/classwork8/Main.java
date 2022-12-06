import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Matcher passwordCheck(String password){
        Pattern pattern = Pattern.compile("^[^!@#$%^&*()]+$");
        return pattern.matcher(password);
    }
    public static Matcher emailCheck(String email){
        Pattern pattern = Pattern.compile("[a-z_\\-0-9]{3,}@[a-z\\-0-9]+\\.[a-z]{2,6}");
        return pattern.matcher(email);
    }

    public static Matcher phoneCheck(String phone){
        Pattern pattern = Pattern.compile("(\\+7|8)[-_ ]9[0-9]{2}[-_ ][0-9]{3}[-_ ][0-9]{2}[-_ ][0-9]{2}");
        return pattern.matcher(phone);
    }

    public static Matcher dateCheck(String date){
        Pattern pattern = Pattern.compile("(([0-2][0-9]|3[0-1]))[./ ](0[1-9]|1[0-2])[./ ]([0-1][0-9]{3}|20([0-1][0-9]|2[0-2]))");
        return pattern.matcher(date);
    }
    public static void main(String[] args) {
        System.out.println(emailCheck("khisisla_m-09@mail198-a.rurrr").matches());
        System.out.println(phoneCheck("+7 923 332 54 54").matches());
        System.out.println(dateCheck("31.12.2022").matches());
        System.out.println(passwordCheck("NtewNtew2301").matches());
    }
}
