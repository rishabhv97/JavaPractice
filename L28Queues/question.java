package L28Queues;

import java.util.*;

public class question {

    // Question 4 Reversing the first K elements of a Queue
    public static Queue<Integer> revKQueue(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q2 = new LinkedList<>();

        if (k > q.size()) return q;

        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        while (!q.isEmpty()) {
            q2.add(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        while (!q2.isEmpty()) {
            q.add(q2.remove());
        }

        return q;
    }

    // Question 5 Maximum of all subarrays of size k
    public static Queue<Integer> maxSubarrays(int arr[], int n, int k){
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < n-k+1; i++) {
            int max=0;
            for(int j=i; j<i+k; j++){
                max=Math.max(max, arr[j]);
            }
            q.add(max);
        }
        return q;
    }

    public static void main(String[] args) {

        // Question 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number");
        // int n = sc.nextInt();
        // Queue<Integer> q = new LinkedList<>();
        // for (int i = 1; i <= n; i++) {
        // q.add(i);
        // }

        // for(int i=0; i<n; i++){
        // String binary = Integer.toBinaryString(q.remove());
        // System.out.print(binary + " ");
        // }

        // question 2
        // int arr[] = {4,3,2,6};

        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // for(int rope : arr){
        // pq.add(rope);
        // }

        // int cost = 0;

        // while(pq.size() > 1){

        // int first = pq.remove();
        // int second = pq.remove();

        // int sum = first + second;

        // cost += sum;

        // pq.add(sum);
        // }

        // System.out.println(cost);

        // question 4

        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);
        // q.add(7);

        // System.out.println(revKQueue(q, 3));

        // Question5
        int arr[]={1,2,3,1,4,5,2,3,6};
        System.out.println(maxSubarrays(arr, 9, 4));;

    }

}
