import java.util.Scanner;

public class pattern9 {

    public static int fibonacci(int n){
        if (n <= 1)
        return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
} 

// public static int fibonacci2(int n) {
//     System.out.println("Calling fib(" + n + ")");
//     if (n <= 1) {
//         System.out.println("Returning " + n);
//         return n;
//     }

//     int result = fibonacci(n-1) + fibonacci(n-2);
//     System.out.println("Returning " + result + " for n = " + n);
//     return result;
// }

static int a = 0, b = 1;

    static void printFibonacci(int n) {
        if (n == 0)
            return;

        int c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;

        printFibonacci(n - 1);
    }

    
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter Number of lines");
        // int n=sc.nextInt();

        System.out.print(fibonacci(101));
        // printFibonacci(1000);

        //    Inverted Pattern
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i+1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // Character Pattern
        // char ch='A';
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // FLOYD'S Triangle
        // int num=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }


        // Inverted half-pyramid with numbers
        // int num=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i+1);j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        //     num=1;
        // }



        // int num=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num);
        //         num=0;
        //     }
        //     System.out.println();
        //     num=1;
        // }

    }
}
