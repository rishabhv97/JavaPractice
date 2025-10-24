public class L22BackTracking {
    public static void changeArr(int arr[], int i, int val) {

        if (i == arr.length) {
            printArr(arr);
            return;

        }

        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;

        }

        // Yes
        findSubsets(str, ans + str.charAt(i), i + 1);

        // /no
        findSubsets(str, ans, i + 1);
    }

    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;

        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(Newstr, ans + curr);
        }
    }

    public static void nQueens(char board[][], int row) {

        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);// func call
                board[row][j] = 'X'; // backtracking
            }

        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1; i>=0 ;i--){
            if (board[i][col]=='Q') {
                return false; 
            }
        }

        //dia left up
        for(int i=row-1, j=col-1; i>=0 && j>=0 ;i--, j--){
            if (board[i][j]=='Q') {
                return false; 
            }
        }

        // diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length ;i--, j++){
            if (board[i][j]=='Q') {
                return false; 
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("---------Chess Board --------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count =0 ;

    public static void main(String[] args) {
        // int arr[]= new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // String str="abc";
        // findSubsets(str, "", 0);

        int n = 4;
        char board[][] = new char[n][n];
        // intialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
        System.out.println("Total ways to solve n queens = " + count);

    }
}
