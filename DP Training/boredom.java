import java.util.Arrays;

public class boredom {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 2, 2, 2, 2, 3 };

        int n = arr.length;
        Arrays.sort(arr);

        int max = arr[n - 1];

        int[] freq = new int[max + 1];
        int[] dp = new int[max + 1];

        Arrays.fill(dp, -1);

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;

        }

        int ans = solve(0, freq, dp);
        System.out.println(ans);

    }

    public static int solve(int i, int[] freq, int[] dp) {
        if (i > freq.length - 1)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int p1 = i*freq[i] + solve(i + 2, freq, dp);
        int p2 = 0 + solve(i + 1, freq, dp);

        dp[i] = Math.max(p1, p2);
        return dp[i];
    }
}
