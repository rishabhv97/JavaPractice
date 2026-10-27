import java.util.Scanner;

public class gridPath1 {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char arr[][] = new char[n][n];

        // Read the grid row by row
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = row.charAt(j);
            }
        }

        int dp[][] = new int[n][n];

       
        if (arr[n - 1][n - 1] == '*') {
            System.out.println(0);
            return;
        }

        dp[n - 1][n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[n - 1][i] == '*') {
                dp[n - 1][i] = 0;
            } else {
                dp[n - 1][i] = dp[n - 1][i + 1];
            }
        }

     
        for (int j = n - 2; j >= 0; j--) {
            if (arr[j][n - 1] == '*') {
                dp[j][n - 1] = 0;
            } else {
                dp[j][n - 1] = dp[j + 1][n - 1];
            }
        }

    
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (arr[i][j] == '*') {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = (int) (
                        ((long) dp[i + 1][j] + dp[i][j + 1]) % MOD
                    );
                }
            }
        }

        System.out.println(dp[0][0]);

        sc.close();
    }
}