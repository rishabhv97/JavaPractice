import java.util.ArrayList;

import java.util.Collections;

public class L23ArrayList {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int currWater = Math.min(height.get(i), height.get(j)) * (j - i);
                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }

    public static int storeWaterOptimised(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0, rp = height.size() - 1;

        while (lp < rp) {
            int currWater = Math.min(height.get(lp), height.get(rp)) * (rp - lp);
            maxWater = Math.max(maxWater, currWater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    //Pair sum for sorted array list 
    public static boolean pairSum(ArrayList<Integer> al, int target) {
        
        int lp = 0;
        int rp = al.size() - 1;
        while (lp < rp) {
            if (al.get(lp) +al.get(rp)==target) {
                return true;
            }else if (al.get(lp)+al.get(rp)<target) {
                lp++;
            }else{
                rp--;
            }
        }
        return false;

    }

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int n=list.size();
        int bp=-1;
        for(int i=0; i<list.size(); i++){
            if (list.get(i)>list.get(i+1)) {
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;

        while (lp!=rp) {
            //case 1
            if (list.get(rp)+list.get(lp)==target) {
                return true;
            }else if (list.get(lp)+list.get(rp)>target) {//case 3
                rp=(n-rp-1)%n;
            }else{
                lp=(lp+1)%n;
            }
        }

        return false;
        
    }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(3);
        // list.add(5);
        // list.add(7);
        // list.add(9);
        // list.add(4);
        // System.out.println(list);

        // get Operattion
        // System.out.println(list.get(2));

        // list.remove(1);
        // System.out.println(list );

        // Set
        // list.set(2, 14);
        // System.out.println(list);

        // Contains
        // System.out.println(list.contains(3));

        // Size Of AL
        // System.out.println(list.size());

        // print reverse of a array list
        // for(int i=list.size()-1; i>=0; i--){
        // System.out.print(list.get(i)+" ");
        // }

        // Max from an Array list
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i< list.size() ;i++){
        // if (max<list.get(i)) {
        // max=list.get(i);
        // }
        // }
        // System.out.println("Maximum is "+ max);

        // // Swap func
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // // Sort
        // Collections.sort(list); //asending
        // Collections.sort(list, Collections.reverseOrder());//Desending
        // System.out.println(list);

        // Multi-d arraylist
        // ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        // ArrayList<Integer> list1=new ArrayList<>();
        // list1.add(1); list1.add(2);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);list2.add(4);

        // mainList.add(list1);
        // mainList.add(list2);

        // for(int i=0; i<mainList.size(); i++){
        // ArrayList<Integer> currList= mainList.get(i);
        // for(int j=0; j< currList.size(); j++){
        // System.out.print(currList.get(j));
        // }
        // System.out.println();
        // }

        // MAximum water trap question
        ArrayList<Integer> height = new ArrayList<>();
        // 186254837 height array

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWaterOptimised(height));
    }
}