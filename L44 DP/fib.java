package L44 DP;

public class fib {

    public static int fib(int n, f[]){
        if (n==0  || n==1) {
            return n;
        }

        if (f[n]!=0) {
            return f[n];
        }

        f[n] = fib(n-1) + fib(n-2);
        return f[n];
    }
    public static void main(String[] args) {
        
    }
}
