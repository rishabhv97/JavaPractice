package L29GreedyAlgorithms;

import java.util.ArrayList;

public class Question {

    //Kth largest odd number in a given range
    public static int largestOdd(int L, int R, int K){
        ArrayList<Integer> oddNums=new ArrayList<>();

       

        for(int i=R; i>=L ; i--){
            if (i%2!=0) {
                oddNums.add(i);
            }
        }

        if (oddNums.size() < K) {
            return 0;
        }else{
            System.out.println(oddNums);
            return oddNums.get(K-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(largestOdd(-3,3,1));
        
    }
}
