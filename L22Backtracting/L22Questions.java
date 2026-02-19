public class L22Questions {

    public static int mazeSolutionCount(int maze[][], int i, int j, int n, int m, boolean isVisited[][]) {
        // iand j use for starting pos, n,m givesize of maze
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;

        } else if (i < 0 || j < 0 || i >= n || j >= m || isVisited[i][j] || maze[i][j] == 0) {
            return 0;
        }

        isVisited[i][j] = true;

        int totalWays = 0;
        // recursion

        totalWays += mazeSolutionCount(maze, i + 1, j, n, m, isVisited);
        totalWays += mazeSolutionCount(maze, i - 1, j, n, m, isVisited);
        totalWays += mazeSolutionCount(maze, i, j + 1, n, m, isVisited);
        totalWays += mazeSolutionCount(maze, i, j - 1, n, m, isVisited);

        // backtrack
        isVisited[i][j] = false;

        return totalWays;

    }

    // question 2
    /*
     * Keypad Combinations
     * 
     * Givenastringcontainingdigitsfrom2-9inclusive,
     * printallpossiblelettercombinationsthatthe number could represent. You can
     * print the answer in any
     * order.Amappingofdigitstoletters(justlikeonthetelephonebuttons)isgivenbelow.
     * Notethat1does not map to any letters.
     */

    public static void StrPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;

        }
        // recursion
        for (int i = 0; i < 2; i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            StrPermutation(Newstr, ans + curr);
        }
    }

    public static void KeypadCombination(String str) {
        int length = str.length();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '2':
                    str2 += "abc";
                    break;
                case '3':
                    str2 += "def";
                    break;
                case '4':
                    str2 += "ghi";
                    break;
                case '5':
                    str2 += "jkl";
                    break;
                case '6':
                    str2 += "mno";
                    break;
                case '7':
                    str2 += "pqrs";
                    break;
                case '8':
                    str2 += "tuv";
                    break;
                case '9':
                    str2 += "wxyz";
                    break;
                default:
                    str2 += "";
                    break;

            }

        }
        // findPermutation(str2, "");

    }

    // knight Move
    // static int count = 0;

    // public static boolean KnightMoves(int board[][], int row,int col, int n,
    // boolean isVisited[][]){
    // if (count==n*n-1) {
    // printBoard(board);
    // return true;
    // }

    // while (count!=63) {
    // if (isSafe(board, row,col, n, isVisited)) {
    // board[row][col]=count;
    // isVisited[row][col]=true;
    // count++;
    // KnightMoves(board, row-2, col-1,n, isVisited) ;
    // KnightMoves(board, row-2, col+1,n, isVisited);
    // KnightMoves(board, row+2, col+1,n, isVisited);
    // KnightMoves(board, row+2, col-1,n, isVisited);
    // KnightMoves(board, row-1, col-2,n, isVisited);
    // KnightMoves(board, row-1, col+2,n, isVisited);
    // KnightMoves(board, row+1, col+2,n, isVisited);
    // KnightMoves(board, row+1, col-2,n, isVisited);

    // }

    // }
    // return false;

    // }

    public static boolean KnightMoves(int board[][], int row, int col, int moveCount, boolean visited[][], int n) {
        // base case: all cells visited
        if (moveCount == n * n) {
            printBoard(board);
            return true;
        }

        // All 8 possible moves
        int[] rowDir = { -2, -2, -1, -1, 1, 1, 2, 2 };
        int[] colDir = { -1, 1, -2, 2, -2, 2, -1, 1 };

        for (int k = 0; k < 8; k++) {
            int nextRow = row + rowDir[k];
            int nextCol = col + colDir[k];

            if (isSafe(nextRow, nextCol, n, visited)) {
                visited[nextRow][nextCol] = true;
                board[nextRow][nextCol] = moveCount;

                if (KnightMoves(board, nextRow, nextCol, moveCount + 1, visited, n))
                    return true;

                // 🧠 Backtrack
                visited[nextRow][nextCol] = false;
                board[nextRow][nextCol] = -1;
            }
        }
        return false;
    }

    public static boolean isSafe(int i, int j, int n, boolean isVisited[][]) {
        if (i < 0 || j < 0 || i >= n || j >= n || isVisited[i][j]) {
            return false;
        }

        return true;
    }

    public static void printBoard(int board[][]) {
        System.out.println("---------Chess Board --------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int n = 4, m = 4;
        // int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1
        // } };
        // boolean[][] isVisited = new boolean[n][m];
        // System.out.println("Total Solutions for Give Maze : " +
        // mazeSolutionCount(maze, 0, 0, n, m, isVisited));

        // String str="23";
        // KeypadCombination(str);

        int n = 8;
        int[][] board = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        // initialize board
        for (int i = 0; i < n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=-1;
            }
        }
            

        board[0][0] = 0;
        visited[0][0] = true;

        KnightMoves(board, 0, 0, 1, visited, n);

    }
}