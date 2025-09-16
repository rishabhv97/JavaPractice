public class Bitwise {
    public static void oddOrEven(int n){
        int bitMask =1;
        if((n & bitMask)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if ((n & bitMask)==0) {
            return 0;
        }else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask= 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask= ~(1<<i);
        return (n & bitMask);
    }

    public static int updateIthBit(int n,int i, int newBit){
        // if (newBit==0) {
        //     return clearIthBit(n, i);
        // }else {
        //     return setIthBit(n, i);
        // }

        n=clearIthBit(n, i);
        int BitMask= newBit<<i;
        return n | BitMask;


    }

    public static int clearIBits(int n,int i){
        int BitMask= (~0)<<i;
        return n & BitMask;
    }

    public static int clearRangeofbits(int n,int i, int j){
        i=(1<<i)-1;
        j=(~0)<<j+1;
        int BitMask=i | j;
        return n & BitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }

    public static int countSetBits(int n){
        int count =0;
        while (n>0) {
            if ((n&1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans=1;

        while ( n>0) {
            if ((n & 1) !=0 ) {
                ans = ans*a;

            }
            a=a*a;
            n= n>>1;
        }
        return ans;
    }


    public static void main(String[] args) {
        // System.out.println(5 &6);
        // System.out.println(5 |6);

        // oddOrEven(7);

        // System.out.println(clearIthBit(10, 1));
        // System.out.println(clearIBits(15, 2));
        // System.out.println(clearRangeofbits(10,2,4));
        // System.out.println(isPowerOfTwo(4));

        // System.out.println(countSetBits(15));
        System.out.println(fastExpo(5, 3));
    }
}
