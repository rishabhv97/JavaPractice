import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
// q1
        // System.out.println("Enter The Number");
        // int x= sc.nextInt();
        // if (x>=0) {
        //     System.out.println("Number is positive");
        // }else{
        //     System.out.println("Number is negative");
        // }


// q2
        // System.out.println("Enter week number");
        // int week= sc.nextInt();
        // switch (week) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2: System.out.println("Tuesday");
        //     break;
        //     case 3: System.out.println("Wednesday");
        //     break;
        //     case 4: System.out.println("Thursday");
        //     break;
        //     case 5: System.out.println("Friday");
        //     break;
        //     case 6: System.out.println("Saturday");
        //     break;
        //     case 7: System.out.println("Sunday");
        //     break;
        
        //     default:
        //     System.out.println("wrong choice");
        //         break;
        // }

// q5

System.out.println("Enter Year : ");
int year = sc.nextInt();
String isLeap= year%4==0?((year%100==0)&&(year%400==0)?"A leap year":"Not a leap year "):"Not a leap year";
System.out.println(isLeap);
        

    }
}
