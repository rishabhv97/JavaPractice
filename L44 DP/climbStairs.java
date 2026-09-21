import java.util.Arrays;

public class climbStairs {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        climb(n, dp);
        System.out.println(climb(n));
    }

    public static int climb(int n, int[] dp) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = climb(n - 1, dp) + climb(n - 2, dp);

        return dp[n];
    }

    // Tabulation method
    public static int climbTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {

            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];

            }

        }

        return dp[n];
    }
}
