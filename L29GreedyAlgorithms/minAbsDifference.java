package L29GreedyAlgorithms;

import java.util.Arrays;

public class minAbsDifference {
    public static void main(String[] args) {
        int A[]={1,2,3};
        int B[]={2,1,4};

        Arrays.sort(A);
        Arrays.sort(B);

        int absDifference=0;

        for(int i=0; i<A.length ; i++){
            absDifference+=Math.abs(A[i]-B[i]);
        }

        System.out.println("Absolute Difference is = "+ absDifference);
    }
}
