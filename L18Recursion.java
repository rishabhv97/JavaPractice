public class L18Recursion {
    public static void printDec(int n){
        if (n==1) {
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static int factorial(int n){
        if (n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int sunOfNaturalNum(int n){
        if (n==1) {
            return n;
        }
        return n+sunOfNaturalNum(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sunOfNaturalNum(n));
    }
}
