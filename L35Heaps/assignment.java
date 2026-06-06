import java.util.ArrayList;
import java.util.PriorityQueue;




public class assignment {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 11, 70, 50, 40, 100, 5 };
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int val : arr) {
            if (pq.size() < k) {
                pq.add(val);
            } else {
                if (val > pq.peek()) {
                    pq.poll();
                    pq.add(val);
                }
            }

            if (pq.size() >= k) {
                res.add(pq.peek());
            } else {
                res.add(-1);
            }
        }

        System.out.println(res);
    }
}
