import java.util.*;

public class Arrays {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }

    public static int linearSearch(int numbers[],int key) {
        for(int i=0;i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return-1;
    }

    public static int getLargest(int numbers[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length; i++){
            if (largest< numbers[i]) {
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static int binarySearch(int numbers[], int key){
        int start=0, end=numbers.length-1;

        while (start<=end) {
            int mid=(start+end)/2;

            if (numbers[mid]==key) {
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first =0,last=numbers.length-1;

        while (first<last) {
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int number[]){
        for(int i=0; i<number.length;i++){
            int curr=number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+curr+","+number[j]+") ");
            }
            System.out.println();
        }
    }

    public static void printSubarrays(int numbers[]){
        int ts=0;
        for(int i=0; i< numbers.length ;i++){
            int start=i;
            for(int j=i; j<numbers.length ;j++){
                int end=j;
                int sum=0;
                for(int k=start; k<=end ;k++){//print
                    System.out.print(numbers[k]+" ");//subarray
                    sum+=numbers[k];
                } System.out.print(" (Sum of Array is : "+ sum +")");
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("The total arrays are :"+ts);
    }

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int numbers[]={2,3,4,5,10};
        int key=10;
        
    //    System.out.println("Index for key is : "+ binarySearch(numbers, key));
    printSubarrays(numbers); 



    }
}
