import java.util.Arrays;
import java.util.Scanner;

public class removingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = Integer.MAX_VALUE;

        System.out.println(solve(n));

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(solveDP(n, dp));

        System.out.println(solveTab(n));

    }

    public static int solveTab(int n){
        int[] dp = new int[n+1];

        dp[0] =0;

        for(int i=1; i<=n ;i++){

            dp[i] = Integer.MAX_VALUE;
            int temp=i;

            while (temp >0 ) {
                int digit = temp%10;
                

                if (digit!=0) {
                    dp[i] = Math.min(dp[i],1+  i-digit);
                }

                temp=temp/10;
            }
        }

        return dp[n];
    }

    public static int solve(int n) {
        if (n == 0) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if (digit != 0) {
                int subproblem = solve(n - digit);

                ans = Math.min(ans, 1 + subproblem);
            }
        }

        return ans;

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
