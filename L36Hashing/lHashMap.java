package L36Hashing;

import java.util.LinkedHashMap;

public class lHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();

        lhm.put("India", 150);
        lhm.put("China", 140);
        lhm.put("US", 140);

        System.out.println(lhm);
    }
}
