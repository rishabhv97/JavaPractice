package L36Hashing;

import java.util.HashMap;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 150);
        map.put("China", 140);
        map.put("US", 50);
        map.put("Nepal", 5);


        // Itrerate
        Set<String> keys= map.keySet();
        System.out.println(keys);

        for(String k: keys){
            System.out.println("key = "+ k +",vlaue = "+ map.get(k));
        }
    }
}
