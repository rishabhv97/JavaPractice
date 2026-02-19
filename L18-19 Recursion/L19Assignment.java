public class L19Assignment {

    public static void occurence(int arr[],int key, int i){
        if (arr[i]==key) {
            System.out.print(i +" ");
        }
        if (i==arr.length-1) {
            return;
        }
        
        occurence(arr, key, i+1);
    }


    public static void numToString(int n, StringBuilder str){
        if (n==0 ) {
            System.out.println(str);
            return;
        }
        int rem=n%10;
        
        if (rem==0 ) {
            str.append(" Zero ");
        }else if (rem==1 ) {
            str.append(" One ");
        } else if (rem==2) {
            str.append(" Two ");
        }else if (rem==3 ) {
            str.append(" Three ");
        } else if (rem==4) {
            str.append(" Four ");
        }else if (rem==5 ) {
            str.append(" Five ");
        } else if (rem==2) {
            str.append(" Six ");
        }else if (rem==3 ) {
            str.append(" Seven ");
        } else if (rem==4) {
            str.append(" Eight ");
        }else{
            str.append(" Nine ");
        }

        numToString(n/10, str);

    }

    public static void numToString(int n) {
    if (n == 0) {
        return;
    }
    int rem = n % 10;
    numToString(n / 10); // go deeper first
    switch (rem) {
        case 0: System.out.print("Zero "); break;
        case 1: System.out.print("One "); break;
        case 2: System.out.print("Two "); break;
        case 3: System.out.print("Three "); break;
        case 4: System.out.print("Four "); break;
        case 5: System.out.print("Five "); break;
        case 6: System.out.print("Six "); break;
        case 7: System.out.print("Seven "); break;
        case 8: System.out.print("Eight "); break;
        case 9: System.out.print("Nine "); break;
    }
    }

    public static int length(String str){
        if (str.length()==0) {
            return 0;
        }
        return length(str.substring(1))+1;
    }

    public static int contigousString(String str, int i ,int j, int n){
        
       if (n==1) {
         return 1;
       }

       if (n<=0) {
         return 0;
       }

       int res = contigousString(str, i+1, j, n-1) + contigousString(str, i, j-1, n-1) -
        contigousString(str, i+1, j-1, n-2);

        if (str.charAt(i)==str.charAt(j)) {
            res++;
        }
        return res;
    }



    public static void main(String[] args) {
        // int arr[]={3,2,4,5,6,2,7,2,2};
        // occurence(arr, 2, 0);

    //     int num = 2045;
    // if (num == 0) {
    //     System.out.println("Zero");
    // } else {
    //     numToString(num);
    // }
        String str="abcab";
        int n = str.length();
        System.out.println(contigousString(str, 0, n-1, n));
    }
}
