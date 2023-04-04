import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void allNumbers(Map<String,String> stringMap){
        stringMap.forEach((key, value) -> System.out.println(value));
    }
    public static void phoneNumberFormatCheck(Map<String,String> stringMap){
        System.out.println("Correct format numbers:");
        stringMap.entrySet().stream()
                .filter(x-> Pattern.compile("\\+7\\s\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}").matcher(x.getValue()).matches())
                .forEach(x -> System.out.println(x.getKey() + ": " + x.getValue()));
    }
    public static <T,K> Map<K,T> mapReverse(Map<T,K> stringMap){
        List<K> listByValue = new ArrayList<>(stringMap.values());
        List<T> listByKey = new ArrayList<>(stringMap.keySet());
        Map<K,T> newMap = new HashMap<>();
        for (int i = 0; i < listByValue.size(); i++) {
            newMap.put(listByValue.get(i),listByKey.get(i));
        }
        return newMap;
    }
    public static <T> void mapSum(Map<T,Integer> map){
        System.out.println(map.entrySet().stream().mapToInt(x-> x.getValue()).sum());

    }
    public static void mapFilter(Map<String,Integer> map, int k){
        map.entrySet().removeIf(x -> x.getValue() > k);
    }
    public static <T> void frequentValues(Map<T,String> map){
        Map<String,Integer> numberOfSimilarStrings = new HashMap<>();
        for (Map.Entry<T,String> s:map.entrySet()) {
            if(!numberOfSimilarStrings.containsKey(s.getValue())){
                numberOfSimilarStrings.put(s.getValue(),1);
            }else{
                numberOfSimilarStrings.put(s.getValue(),numberOfSimilarStrings.get(s.getValue()) + 1);
            }
        }
        System.out.println(numberOfSimilarStrings);
        int maxInt = numberOfSimilarStrings.values().stream().max(Integer::compareTo).get();
        numberOfSimilarStrings.entrySet().stream().filter(x->x.getValue().equals(maxInt)).forEach(x-> System.out.println(x.getKey()));
    }
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("khismatullin", "+7 (904)-777-98-26");
        map.put("karpov", "+7 (904)-777-98-23");
        map.put("bagutin", "+7-904-777-12-26");
        map.put("shemelov", "+7 (904)-777-44-26");
        allNumbers(map);
        phoneNumberFormatCheck(map);
        System.out.println(mapReverse(map));
        Map<String, Integer> map1 = new TreeMap<>();
        map1.put("A", 10);
        map1.put("B", -3);
        map1.put("C", 23);
        map1.put("D", 40);
        map1.put("E", 30);
        mapSum(map1);
        Map<Integer,String> map2 = mapReverse(map1);
        map2.put(50,"A");
        map2.put(60,"A");
        map2.put(70,"B");
        map2.put(80,"B");
        System.out.println(map2);
        frequentValues(map2);
    }
}
