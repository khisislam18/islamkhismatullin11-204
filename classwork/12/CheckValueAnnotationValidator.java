import java.lang.reflect.*;

public class CheckValueAnnotationValidator {
    public static boolean isValid(Class clazz, Object object) throws Exception{
        Field[] fields = clazz.getDeclaredFields();
        boolean flag = true;
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if(field.isAnnotationPresent(CheckValue.class)){
                field.setAccessible(true);
                CheckValue checkValue = field.getAnnotation(CheckValue.class);
                String[] access = checkValue.accessibleValues();
                String value = (String) field.get(object);
                for (String s : access) {
                    if (value.equals(s)) {
                        flag = true;
                        break;
                    }else{
                        flag = false;
                    }
                }
                if(!flag){
                    return false;
                }
            }
        }
        return true;
    }
}
