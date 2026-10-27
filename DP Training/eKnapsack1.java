import java.util.Scanner;

public class eKnapsack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int w= sc.nextInt();

        int wt[] = new int[n];
        int val[] = new int[n];

        for(int i=0; i< n; i++){
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }

        int maxProfit=0;

        for(int i = 0; i< n ; i++){
            maxProfit += val[i];
        }

        int dp[][] = new int[n+1][maxProfit+1];

        dp[0][0] = 0;

        // first col

        for(int i=1; i<=n ; i++){
            dp[i][0] = 0;
        }

        // first row

        for(int i=1; i<= maxProfit ;i++){
            dp[0][i] = 1_000_000_000;
        }

        for(int i=1; i<=n ;i++){
            for(int j=1; j<= maxProfit ;j++){

                if (val[i-1]<=j) {
                    dp[i][j] = Math.min(wt[i-1] + dp[i-1][j- val[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        int ans =0;

        for( int j=maxProfit ; j>= 0 ; j-- ){
            if (dp[n][j] <= w) {
                ans = j ;
                break;
            }
        }

        System.out.println(ans);

    }
}
