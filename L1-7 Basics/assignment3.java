import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter The Number of Input");
        // int n=sc.nextInt();
        // int evenSum=0;
        // int oddSum=0;
        // System.out.println("Enter "+n+" Integers");
        // for(int i =0;i<n;i++){
        //     int num=sc.nextInt();
        //     if(num%2==0){
        //         evenSum+=num;
        //     }else{
        //         oddSum+=num;
        //     }
        // }
        // System.out.println("Sum of even integers is:"+evenSum);
        // System.out.println("Sum of odd integers is:"+oddSum);


        // Qs-3 Factorial 
        // System.out.println("Enter Number ");
        // int n= sc.nextInt();
        // int Factorial=1;
        // for(int i=n; i>0;i--){
        //     Factorial*=i;
        // }
        // System.out.println("Factorial of "+n+" is " + Factorial);

        // Multiplication Table
        System.out.println("Enter Number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+ n*i);
        }
    }
}
