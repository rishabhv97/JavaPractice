public class L20Assignment {
    public static void printArr(String arr[]){

        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void mergeSort(String arr[], int si, int ei){
        if (si>=ei) {
            return;
        }
        // Kaam
        int mid = si+ (ei-si)/2;
        mergeSort(arr, si, mid); //Left Part
        mergeSort(arr, mid+1, ei); //Right Part
        merge(arr,si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei){
        String temp[]= new String[ei-si+1];
        
        int i=si;
        int j= mid+1;
        int k=0;

        while (i<= mid && j<= ei) {
            if (arr[i].compareTo(arr[j])<=0) {
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
    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
