package L29GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> ans=new ArrayList<>();
        int amt=590;
        int count=0;

        for(int i=0; i<coins.length; i++){
            if (coins[i]<=amt) {
                while (coins[i]<=amt) {
                    count++;
                    ans.add(coins[i]);
                    amt-=coins[i];
                }
            }
        }

        System.out.println(count);
        //also can print the ans
    }
}
