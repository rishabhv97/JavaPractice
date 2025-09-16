import java.util.Scanner;

public class Fxn10 {

    public static void printHelloWorld(){
        System.out.println("Hello Duniya");
    }

    public static int calSum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }

    public static int Factorial(int n){
        
        int Factorial=1;
        for(int i=n; i>0;i--){
            Factorial*=i;}
        return Factorial;
        
    }

    public static int binomialCoefficient(int n,int r){
        int nCr= Factorial(n)/(Factorial(r)*Factorial(n-r));
        return nCr;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum(float a,float b){
        return a+b;
    }

    public static boolean isPrime(int n){

        if(n==2) return true;

        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2; i<=n;i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void binToDec(int binNum){
        int n=binNum;
        int dec=0;
        int pow=0;
       
        for(int i=binNum; i>0 ;i/=10){
             
            int lastDigit=i%10;
            dec+= lastDigit*(int)Math.pow(2,pow );
            pow++;
        }
        System.out.println("Decimal of "+n+" is " + dec);
    }

    public static void decToBin(int n){
        int bin=0;
        int pow=0;
        for(int i=n; i>0; i/=2){
            
            bin+=(i%2)*Math.pow(10, pow);
            pow++;
        }
        System.out.println("Binary is "+ bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        decToBin(7);;

        


    }
    
}
