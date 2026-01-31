package Revision;

public class Practice {
    public boolean isUgly(int n) {

        if (n<=0) {
            return false;
        }
        while (n>0) {
            if (n%2==0) {
                n=n/2;
            }else if (n%3==0) {
                n=n/3;
            }else if (n%5==0) {
                n=n/5;
            }else{
                break;
            }
        }

        if (n==1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isPowerOfTwo(int n) {
        if (n==1) {
            return true;
        }
        
        if(n%2!=0 || n<=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
        

    
    public static void main(String[] args) {
        
         
    }
}
