package L35Heaps;

import java.util.HashSet;

public class countMax {
    public static void main(String[] args) {
        
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< num.length ; i++){
            set.add(nums[i]);

        }

        System.out.println("Ans = " + set.size());
    }
}
