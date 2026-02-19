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
    public static int fibonacci(int n){
        if (n==0 ||n==1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static boolean isSorted(int arr[], int i){
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[],int i, int key){
        if (arr[i]==key) {
            return i;
        }
        if (i==arr.length-1) {
            return -1;
        }
        return firstOccurence(arr, i+1, key);

    }
    public static int lastOccurence(int arr[], int i, int key){
        if (i==arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, i+1, key);
        if (isFound == -1 && arr[i]==key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if (n==0) {
            return 1;
        }
        // int xnm1=power(x,n-1);
        // int xn=x*xnm1;
        // return xn;
        return x*power(x, n-1);
    }
    public static int optimizedPower(int a,int n){
        if (n==0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower*halfPower;

        // n is odd
        if (n%2 !=0) {
            halfPowerSq= a*halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,5,5};
        // System.out.println(lastOccurence(arr, 0,5));
        System.out.println(power(2,10));
    }
}
