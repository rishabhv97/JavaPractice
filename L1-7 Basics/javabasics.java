import java.util.Scanner;

public class javabasics {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
    
        // System.out.println("Enter your Income");
        // int income= sc.nextInt();
        // int tax;

        // if (income<500000) {
        //     tax=0;
        // }else if(income >= 500000 && income<1000000){
        //     tax=(int)(0.2*income);
        // }
        // else{
        //     tax=(int)(0.3*income);
        // }

        // System.out.println("Your Tax is :" +tax);

        // Greater Number
        // int a=1,b=3,c=8;

        // if ((a>=b)&&(a>=c)) {
        //     System.out.println("Largest is A");
        // }else if (b>=c) {
        //     System.out.println("LArget is b");

        // }else{
        //     System.out.println("Largest is c");
        // }

        // int number =4;
        // String type = ((number%2)==0)? "even":"odd";
        // System.out.println(type);

        // int number=3;
        // switch (number) {
        //     case 1:
        //         System.out.println("1");
        //         break;
        // case 2:
        // System.out.println(2);
        // break;
        //     default:
        //     System.out.println("nothing");
        //         break;
        // }


        // Calculator
        // System.out.println("Enter a :");
        // int a= sc.nextInt();
        // System.out.println("Enter b :");
        // int b= sc.nextInt();
        // System.out.println("Enter Operator");
        // char operator = sc.next().charAt(0);

        // switch(operator){
        //     case '+': System.out.println(a+b);
        //     break;
        //     case '-': System.out.println(a-b);
        //     break;
        //     case '*': System.out.println(a*b);
        //     break;
        //     case '/': System.out.println(a/b);
        //     break;
        //     case'%': System.out.println(a%b);
        //     break;
        //     default: System.out.println("Please Enter a valid operator from +,-,*,/");
        // }


        // int i=1;
        // int sum=0;
        // System.out.println("Enter Number");
        // int n=sc.nextInt();
        // while (i<=n) {
        //     sum+=i;
        //     i++;
        // }
        // System.out.println(sum);


        // for(int i=1;i<=10;i++){
        //     System.out.println("Hello World " + i);
        // }

        // for(int line=1;line<=4;line++){
        //     System.out.println("****");
        // }

        // int num=10899;
        // int reverse=0;
        // for(int i=num;i>0;i/=10){
        //     int lastDigit=i%10;
        //     reverse=(reverse*10)+lastDigit;
        // }
        // System.out.println(reverse);


        // do{
        //     System.out.println("Enter Your Number");
        //     int n = sc.nextInt();
        //     if(n%10 ==0){
        //         break;
        //     }
        //     System.out.println(n);
        // }while(true);


        // for(int i=1;i<=50;i++){
        //     if (i%5==0) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        


        // Prime Number
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                count++;
            }
        }
        if (count>0) {
            System.out.println("Number is Composite");
        }else{
            System.out.println("Number is prime");
        }


     }
}
