import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of lines");
        int n=sc.nextInt();

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
