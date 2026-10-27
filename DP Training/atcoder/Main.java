import java.util.*;


public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][3];

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int dp[][] = new int[n][3];

        // initialize
        for(int i=0; i<3; i++){
            dp[n-1][i] =arr[n-1][i];
        }

        for(int i=n-2; i>= 0; i--){
            for(int j=0; j<3 ;j++){
                dp[i][j] = arr[i][j] + Math.max(dp[i+1][(j+1)%3], dp[i+1][(j+2)%3]);
            }
        }

        int ans=Integer.MIN_VALUE;

        for(int i=0; i<3 ;i++){
            ans = Math.max(ans, dp[0][i]);
        }

        System.out.println(ans);


        
    }

}
