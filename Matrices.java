import java.util.Scanner;

public class Matrices {
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow<= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol ; j++){
                System.out.print(matrix[startRow][j]+" ");
            } 
            //right
            for(int i=startRow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }          

            // bottom
            for(int j=endCol-1; j>=startCol;j--){
                if (startRow==endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            // left
            for(int i=endRow-1; i>=startRow+1; i--){
                if (startCol==endCol) {
                    break;}
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();

    }

    public static int diagonalSum(int matrix[][]){
        int sum=0;

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if (i==j) {
        //             sum+= matrix[i][j];
        //         }
        //         else if (i+j== matrix.length-1) {
        //             sum+=matrix[i][j];
                    
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length;i++){
            // Primary diagonal
            sum+=matrix[i][i];

            // Secondary diagonal
            if (i != matrix.length-1-i) {
                
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        int row=0,col=matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            if (matrix[row][col]==key) {
                System.out.println("found at ("+row+","+ col+")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not found");
        return false;
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i=0;i< matrix.length-1; i++){
            for(int j=0; j<matrix[i].length-1; j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0; i<nums.length ; i++){
            for(int j=1; j<nums.length ; j++){
                if (nums[i]+nums[j]==target) {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // printSpiral(matrix);
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}};
        int key=33;

        staircaseSearch(matrix, key);



        // int matrix[][]=new int[3][3];

        // int m=matrix.length,n=matrix[0].length;
        // System.out.println("Enter Elements of Matrix");
        // Scanner sc= new Scanner(System.in);
        // for(int i=0; i<m;i++){
        //     for(int j=0; j<n; j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }

        // // output
        // for(int i=0; i<m;i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }


    }
    
}
