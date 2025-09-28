public class L20DivideAndConc {
    public static void printArr(int arr[]){

        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void mergeSort(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }
        // Kaam
        int mid = si+ (ei-si)/2;
        mergeSort(arr, si, mid); //Left Part
        mergeSort(arr, mid+1, ei); //Right Part
        merge(arr,si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]= new int[ei-si+1];
        int i=si;
        int j= mid+1;
        int k=0;

        while (i<= mid && j<= ei) {
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++; 
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        // Left Part remaining
        while (i<= mid) {
            temp[k++]=arr[i++];
        }

        // Right Part remaining
        while (j<= ei) {
            temp[k++]=arr[j++];
        }

        // copy temp to original arr
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void quickSort(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }

        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);//Left
        quickSort(arr, pIdx+1, ei);//right
    }
    public static int partition(int arr[],int si ,int ei){
        int pivot=arr[ei];
        int i=si-1; //To make place for els smaller than pivot

        for(int j=si; j<ei; j++){
            if (arr[j]<=pivot) {
                i++;
                // Swap
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;


    }

    public static int search(int arr[],int target, int si, int ei){
        if (si>ei) {
            return -1;
        }
        int mid = si+(ei-si)/2;

        // Case Found
        if (arr[mid]==target) {
            return mid;
        }

        // Line L1
        if (arr[si]<=arr[mid]) {
            // case a
            if (arr[si]<=target && target<=arr[mid]) {
                return search(arr, target, si, mid-1);
            }else{
                // case b
                return search(arr, target, mid+1, ei);
            }
        }

        // mid on L2
        else{
            // case c right
            if (arr[mid]<= target && target <= arr[ei]) {
                return search(arr, target, mid+1, ei);
            }else{
                // case d : left
                return search(arr, target, si, mid-1);
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        // mergeSort(arr, 0, arr.length-1);
        // quickSort(arr, 0, arr.length-1);
        int target =0;
        System.out.println(search(arr, target,0 ,arr.length-1)); 
    }
}
