import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

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

        sc.close();
    }

    public static int solve(int i, int[] freq, int[] dp) {

        if (i >= freq.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // Choose i
        int p1 = i * freq[i] + solve(i + 2, freq, dp);

        // Skip i
        int p2 = solve(i + 1, freq, dp);

        dp[i] = Math.max(p1, p2);

        return dp[i];
    }
}