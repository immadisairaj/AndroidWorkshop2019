import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentHashMap = new HashMap<>();
        studentHashMap.put(1, "Cersie");
        studentHashMap.put(2, "Jamie");
        studentHashMap.put(3, "The Mountain");
        studentHashMap.put(4, "Jaken Hagar");
        studentHashMap.put(5, "Daenyraes T");
        studentHashMap.put(7, "Jon Snow");

        System.out.println(studentHashMap);

        studentHashMap.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

        LinkedHashMap<Integer, String> studentLinkedHashMap = new LinkedHashMap<>();
        studentLinkedHashMap.put(1, "Cersie");
        studentLinkedHashMap.put(2, "Jamie");
        studentLinkedHashMap.put(3, "The Mountain");
        studentLinkedHashMap.put(4, "Jaken Hagar");
        studentLinkedHashMap.put(5, "Daenyraes T");
        studentLinkedHashMap.put(7, "Jon Snow");

        System.out.println(studentLinkedHashMap);

        studentHashMap.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

        HashMap<Integer, String> conntryCodeHashMap = new HashMap<>();
        

    }
}
