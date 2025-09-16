public class assignment4 {

    public static void isPalindrome(int n){
        int orignalNum=n;
        int reverse=0;
        for(int i=n;i>0;i/=10){
            int lastDigit=i%10;
            reverse=reverse*10+lastDigit;
        }
        if (orignalNum==reverse) {
            System.out.println("The Number is Palindrome");
        }else System.out.println("The number is not palindrone");
        
    }

    public static void sumOfDigits(int n){
        int sum=0;
        for(int i=n; i>0; i/=10){
            int lastDigit=i%10;
            sum+=lastDigit;
        }
        System.out.println("The sum of digit is :"+ sum);
    }
    public static void main(String[] args) {
        
        isPalindrome(1221);
        sumOfDigits(1231);
    }
    
}
