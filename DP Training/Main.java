import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(solveDP(n, dp));
    }

    public static int solveDP(int n, int []dp){

        if (n==0) {
            return 0;
        }

        if (dp[n]!=-1) {
            return dp[n];
        }

        int ans = Integer.MAX_VALUE;
        String s = String.valueOf(n);

        for(int i=0; i < s.length() ;i++){

            int digit = s.charAt(i) -'0';

            if (digit != 0) {
                int subproblem = solveDP(n - digit, dp);

                ans = Math.min(ans, 1 + subproblem);
            }
            
        }
        dp[n]=ans;

        return dp[n];

    }
}
