import java.net.Socket;
import java.util.Scanner;

public class Stringss {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static float getPath(String path){
        int x=0,y=0;

        for(int i=0; i<path.length(); i++){
            char dir =path.charAt(i);
            // South
            if (dir=='S') {
                y--;
            }
            // North
            else if (dir=='N') {
                y++;
            }
            // East
            else if (dir=='E') {
                x++;
            }
            // West
            else if (dir=='W') {
                x--;
            }
        }

        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static String subString(String str, int si, int ei){
        String substr="";
        for(int i=si; i<ei; i++){
            substr+= str.charAt(i);
        }
        return substr;
    }


    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length();i++){
            if (str.charAt(i)==' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        String newStr="";

        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count>1) {
                newStr +=count.toString();
            }
        }
        return newStr;
    }


    public static String compress2(String str){
         StringBuilder newStr=new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            
            newStr.append(str.charAt(i));
            
            if (count>1) {
                newStr.append(count.toString());
                
            }
        }
        return newStr.toString();
    }


    public static void main(String[] args) {
        char arr[]={'a','c','d'};
        String str="abcdee";

        Scanner sc= new Scanner(System.in);
        // String name;
        // name=sc.nextLine();
        // System.out.println(name);

        // String name="Romeo";
        // System.out.println(name.length());

        // Concatenation
        // String firstName="Rishabh";
        // String lastName="Verma";
        // String fullName= firstName+" "+lastName;
        // System.out.println(fullName.charAt(0));
        // printLetters(fullName);


        // String name="racecar";
        // System.out.println(isPalindrome(name));

        // String path ="WNEENESENNN";
        // System.out.println(getPath(path));

        // String str2 ="HelloWorld";
        // System.out.println(subString(str2, 0, 5));
        // System.out.println(str2.substring(0,5));


        // String fruits[]={"apple","mango","Banana","zebra"};

        // String largest=fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if(largest.compareToIgnoreCase(fruits[i])<0){
        //         largest=fruits[i];
        //     }
        // }
        // System.out.println(largest);


        // String Builder
        // StringBuilder sb= new StringBuilder("");
        // for(char ch='a'; ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb.length());

        // String str3="dil ka dariya bah hi gya";
        // System.out.println(toUpperCase(str3));


        String strrr ="aaabbcccd";
        System.out.println(compress(strrr));
        System.out.println(compress2(strrr));
    } 
    
    
}
