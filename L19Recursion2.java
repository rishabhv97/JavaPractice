public class L19Recursion2 {
    public static int tileProblem(int n){
        // 2xn size flooor
        if (n==0 || n==1) {
            return 1;
        }

        // Vertical Tiles
        int fnm1 = tileProblem(n-1);

        // Horizontal tiles
        int fnm2= tileProblem(n-2);

        int totalWays=fnm1+fnm2;
        return totalWays;
    }

    public static void removeDuplicates(String str,int idx, StringBuilder newStr, boolean map[]){
        if (idx==str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar-'a']==true) {
            removeDuplicates(str, idx+1, newStr, map);
        }else {
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void printBinStrings(int n, int lastPlace, String str){
        if (n==0) {
            System.out.println(str);
            return;
        }

        printBinStrings(n-1,0, str+"0");
        if (lastPlace==0) {
            printBinStrings(n-1, 1, str+"1");
        }
        // if (lastPlace==0) {
        //     printBinStrings(n-1, 0, str.append("0"));
        //     printBinStrings(n-1, 1, str.append("1"));
        // }else{
        //     printBinStrings(n-1,0, str.append("0"));
        // }
    }
    public static void main(String[] args) {
        // System.out.println(tileProblem(6));
        // String str ="appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        printBinStrings(3,0,"");
    }
}
