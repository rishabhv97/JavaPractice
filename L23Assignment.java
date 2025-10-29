import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class L23Assignment {

    // Question 1 :Monotonic ArrayList(EASY)

    public static boolean Monotonic(ArrayList<Integer> numList){
        boolean MonotonicInc=false;
        boolean MonotonicDec=false;
        for(int i=0,j=0; i<numList.size()-1; i++,j++){
            if (numList.get(i)<=numList.get(i+1)) {
                MonotonicInc=true;
            }else if (numList.get(j)>=numList.get(j+1)) {
                MonotonicDec=true;
            }
            else{
                MonotonicInc=false;
                MonotonicDec=false;
            }
        }

        return (MonotonicDec||MonotonicInc);
    }

    //correct version
    public static boolean isMonotonic(ArrayList<Integer> numList) {
    boolean increasing = true;
    boolean decreasing = true;

    for (int i = 0; i < numList.size() - 1; i++) {
        if (numList.get(i) < numList.get(i + 1)) {
            decreasing = false;
        }
        if (numList.get(i) > numList.get(i + 1)) {
            increasing = false;
        }
    }

    return increasing || decreasing;


}

// Question 2 :Lonely Numbers in ArrayList

    public static ArrayList<Integer> isLonely(ArrayList<Integer> numList){
        ArrayList<Integer> result=new ArrayList<>();
        Collections.sort(numList);

        if (numList.get(0)+1 !=numList.get(1)) {
                    result.add(numList.get(0));
                }
        if (numList.get(numList.size()-1) !=numList.get(numList.size()-2)-1) {
                    result.add(numList.get(numList.size()-1));
                }

        
        for(int i=1; i<numList.size()-1; i++){
            
            if ((numList.get(i)+1!=numList.get(i+1))&&(numList.get(i)-1!=numList.get(i-1))) {
                result.add(numList.get(i));
            }
        }
        return result;
    }

    // chat gpt
    public static ArrayList<Integer> isLonely2(ArrayList<Integer> numList) {
    ArrayList<Integer> result = new ArrayList<>();
    Collections.sort(numList);

    int n = numList.size();

    for (int i = 0; i < n; i++) {
        boolean leftOK = (i == 0) || (numList.get(i) - numList.get(i - 1) > 1);
        boolean rightOK = (i == n - 1) || (numList.get(i + 1) - numList.get(i) > 1);

        if (leftOK && rightOK) {
            result.add(numList.get(i));
        }
    }

    return result;
}
    public static void main(String[] args) {


        ArrayList<Integer> numList=new ArrayList<>();
        numList.add(10);
        numList.add(6);
        numList.add(5);
        numList.add(8);
        System.out.println(isLonely(numList));
    }
}
