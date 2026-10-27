import java.util.Scanner;

public class aFrog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(arr,n));
    }

    static int solve(int[] arr, int n){
        int dp[] = new int[n];

        dp[n-1]=0;
        dp[n-2]= Math.abs(arr[n-1] - arr[n-2]);

        for(int i=n-3; i>=0 ;i--){
            int d1=Math.abs(arr[i]-arr[i+1]);
            int d2= Math.abs(arr[i]-arr[i+2]);

            dp[i] = Math.min(d1 + dp[i+1] , d2 + dp[i+2]);
        }

        return dp[0];
    } 
}
