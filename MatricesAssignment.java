public class MatricesAssignment {

    public static void countSeven(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                if (arr[i][j]==7) {
                    count+=1;
                }
            }
        }

        System.out.println(count);
    }
    public static void sumSecRow(int arr[][]){
        int sum=0;
        int row=1;
        for(int i=0;i<arr[row].length; i++){
            sum+=arr[row][i];
            }

        System.out.println(sum);    
        }

    public static void Transpose(int arr[][]){
        for(int i=0;i<2; i++){
            for(int j=0;j<3; j++){
                
                arr[j][i]=arr[i][j];
                
            }
        }
    }

    public static void PrintArr(int arr[][]){
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
       int arr[][]={
       {1,7,8},
       {11,4,3}};
       
       Transpose(arr);
       PrintArr(arr);
    }
}
