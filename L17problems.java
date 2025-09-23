import java.util.Scanner;

public class L17problems {
    public static void main(String[] args) {
    Complex c=new Complex();
    c.sumComplex();

         
    }
}
class Complex  {
    void sumComplex(){
        System.out.println("Enter First complex number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Real part");
        int a1 = sc.nextInt();
        System.out.println("Imaginary Part");
        int b1 = sc.nextInt();
        System.out.println("Enter Second Complex number");
        System.out.println("Real part");
        int a2 = sc.nextInt();
        System.out.println("Imaginary Part");
        int b2 = sc.nextInt();
        System.out.println("The Sum is "+ (a1+a2) +"+"+ (b1+b2)+"i");

    }
    void subComplex(){
        System.out.println("Enter First complex number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Real part");
        int a1 = sc.nextInt();
        System.out.println("Imaginary Part");
        int b1 = sc.nextInt();
        System.out.println("Enter Second Complex number");
        System.out.println("Real part");
        int a2 = sc.nextInt();
        System.out.println("Imaginary Part");
        int b2 = sc.nextInt();
        System.out.println("The difference is "+ (a1-a2) +"+"+ (b1-b2)+"i");

    }
    void productComplex(){
        System.out.println("Enter First complex number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Real part");
        int a1 = sc.nextInt();
        System.out.println("Imaginary Part");
        int b1 = sc.nextInt();
        System.out.println("Enter Second Complex number");
        System.out.println("Real part");
        int a2 = sc.nextInt();
        System.out.println("Imaginary Part");
        int b2 = sc.nextInt();
        System.out.println("The Sum is "+ (a1*a2) +"+"+ (b1*b2)+"i");

    }
    
}