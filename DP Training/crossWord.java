import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<String> crosswordPuzzle(List<String> crossword, String words) {

        // Convert List<String> into char[][] so we can modify the grid
        char[][] grid = new char[10][10];

        for (int i = 0; i < 10; i++) {
            grid[i] = crossword.get(i).toCharArray();
        }

        String[] wordList = words.split(";");

        solve(grid, wordList, 0);

        // Convert char[][] back to List<String>
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            result.add(new String(grid[i]));
        }

        return result;
    }

    // Backtracking function
    public static boolean solve(char[][] grid, String[] words, int index) {

        // All words have been placed
        if (index == words.length) {
            return true;
        }

        String word = words[index];

        for (int row = 0; row < 10; row++) {

            for (int col = 0; col < 10; col++) {

                // Try horizontal placement
                if (canPlaceHorizontal(grid, word, row, col)) {

                    boolean[] placed =
                        placeHorizontal(grid, word, row, col);

                    if (solve(grid, words, index + 1)) {
                        return true;
                    }

                    // Undo placement
                    removeHorizontal(grid, word, row, col, placed);
                }

                // Try vertical placement
                if (canPlaceVertical(grid, word, row, col)) {

                    boolean[] placed =
                        placeVertical(grid, word, row, col);

                    if (solve(grid, words, index + 1)) {
                        return true;
                    }

                    // Undo placement
                    removeVertical(grid, word, row, col, placed);
                }
            }
        }

        return false;
    }

    // Check whether word can be placed horizontally
    public static boolean canPlaceHorizontal(
            char[][] grid, String word, int row, int col) {

        // Word must fit inside the grid
        if (col + word.length() > 10) {
            return false;
        }

        // Cell immediately before word should not be '-'
        if (col > 0 && grid[row][col - 1] == '-') {
            return false;
        }

        // Cell immediately after word should not be '-'
        if (col + word.length() < 10 &&
            grid[row][col + word.length()] == '-') {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {

            char cell = grid[row][col + i];

            // It must either be empty or contain the same letter
            if (cell != '-' && cell != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Check whether word can be placed vertically
    public static boolean canPlaceVertical(
            char[][] grid, String word, int row, int col) {

        // Word must fit inside the grid
        if (row + word.length() > 10) {
            return false;
        }

        // Cell immediately before word should not be '-'
        if (row > 0 && grid[row - 1][col] == '-') {
            return false;
        }

        // Cell immediately after word should not be '-'
        if (row + word.length() < 10 &&
            grid[row + word.length()][col] == '-') {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {

            char cell = grid[row + i][col];

            // It must either be empty or contain the same letter
            if (cell != '-' && cell != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Place word horizontally
    public static boolean[] placeHorizontal(
            char[][] grid, String word, int row, int col) {

        boolean[] placed = new boolean[word.length()];

        for (int i = 0; i < word.length(); i++) {

            if (grid[row][col + i] == '-') {
                grid[row][col + i] = word.charAt(i);
                placed[i] = true;
            }
        }

        return placed;
    }

    // Undo horizontal placement
    public static void removeHorizontal(
            char[][] grid,
            String word,
            int row,
            int col,
            boolean[] placed) {

        for (int i = 0; i < word.length(); i++) {

            if (placed[i]) {
                grid[row][col + i] = '-';
            }
        }
    }

    // Place word vertically
    public static boolean[] placeVertical(
            char[][] grid, String word, int row, int col) {

        boolean[] placed = new boolean[word.length()];

        for (int i = 0; i < word.length(); i++) {

            if (grid[row + i][col] == '-') {
                grid[row + i][col] = word.charAt(i);
                placed[i] = true;
            }
        }

        return placed;
    }

    // Undo vertical placement
    public static void removeVertical(
            char[][] grid,
            String word,
            int row,
            int col,
            boolean[] placed) {

        for (int i = 0; i < word.length(); i++) {

            if (placed[i]) {
                grid[row + i][col] = '-';
            }
        }
    }
}


public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<String> crossword =
            IntStream.range(0, 10)
                .mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        String words = bufferedReader.readLine();

        List<String> result =
            Result.crosswordPuzzle(crossword, words);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
                + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}