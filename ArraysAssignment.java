import java.util.Scanner;

public class ArraysAssignment {

    public static void multiNumber(int num[]){
        boolean isMulti=false;
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length;j++){
                if (num[i]==num[j]) {
                    isMulti=true;
                }
            }
        }

        System.out.println(isMulti);
    }

    public static void pivotAndSearch(int num[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position for pivot");
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=num[i];
        }
        for(int i=0; i< num.length-k; i++){
            num[i]=num[k+i];
        }
        for (int i = 0; i < k; i++) {
            num[num.length - k + i] = arr[i];
        }



        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }

        System.out.println("Enter element to be search");
        int search=sc.nextInt();
        boolean found = false;
        for (int i = 0; i < num.length; i++) {
        if (search == num[i]) {
        System.out.println("Found at index: " + i);
        found = true;
        break;
        }
        }
        if (!found) {
        System.out.println(-1);
        }
    }
    
    public static int rotatedSearch(int num[],int key){

        int start=0,end=num.length-1;
        while (start<=end) {
            int mid=start+end/2;
            if (mid==end) {
                return mid;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
       
        int num2[]={4,5,6,7,0,1,2,3};
        pivotAndSearch(num2);
    }
}
