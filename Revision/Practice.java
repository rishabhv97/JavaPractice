package Revision;

import java.util.Scanner;
import java.util.Stack;
import java.util.*;

 class student{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
 }

public class Practice {
    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                break;
            }
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }

        if (n % 2 != 0 || n <= 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {

        student s1=new student();
        s1.setName("Rohan");
        System.out.println(s1.getName());
        Scanner sc = new Scanner(System.in);
        // String word = sc.next();

        // if (word.equals("Red")) {
        // System.out.println("Stop");
        // } else if (word.equals("Yellow")) {
        // System.out.println("Wait");
        // } else if (word.equals("Green")) {
        // System.out.println("You can go");
        // } else {
        // System.out.println("Wrong choice please choose from Red, Yellow, or Green");
        // }

        // for(int i=1; i<11; i++){
        // System.out.println(i+ " ");
        // }

        // int i=1;
        // while (i<=10) {
        // System.out.println(i);
        // i++;
        // }

        // System.out.println("Enter DOB");
        // double n = sc.nextDouble();
        // double res = 0;
        // for (double i = n; i > 0; i = i / 10) {
        // res = res + i % 10;
        // }

        // int sum = 0;
        // if (res > 9) {

        // while (res != 0) {

        // sum += res % 10;
        // res = res / 10;
        // }
        // }

        // System.out.println(sum);

        System.out.println("Enter DOB :");
        long n = sc.nextLong(); 
        long res = 0;

        
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }

        
        long sum = 0;
        if (res > 9) {
            while (res > 0) {
                sum += res % 10;
                res /= 10;
            }
        } else {
            sum = res;
        }

        System.out.println("Sum is " + sum);

        int s =Math.toIntExact(sum);

        


        switch (s) {
            case 1:
                System.out.println("The primal Force");
                break;
            case 2:
                System.out.println("The all-Knowing");
            case 3:
                System.out.println("The Creative Child");
            case 4:
                System.out.println("The Salt of the Earth");
            case 5:
                System.out.println("The Salt of the Earth");
            case 6:
                System.out.println("The Salt of the Earth");
            case 7:
                System.out.println("The Salt of the Earth");
            case 8:
                System.out.println("The Salt of the Earth");
            case 9:
                System.out.println("The Salt of the Earth");
            
        
            default:
                
                break;}
        }


    
    
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arr={2,5,7,8,2,1,5,2};
        
        for (int num: arr) {
            // if(hashMap.containsKey(num)){
            //   hashMap.put(num, hash) 
            // }
            
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
            
            
        }
        
        for(int key: hashMap.keySet()){
            System.out.println(key+":"+hashMap.get(key));
        }
         

    }

}
