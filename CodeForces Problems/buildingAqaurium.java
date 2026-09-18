package CodeForces Problems;
import java.util.*;

public class buildingAqaurium {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            // x give total water allowed
            
            long x = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long low = 1;
            long high = 2_000_000_000L;
            long ans = 1;

            while (low <= high) {

                long mid = low + (high - low) / 2;

                long water = 0;

                for (int i = 0; i < n; i++) {

                    if (a[i] < mid) {
                        water += (mid - a[i]);
                    }

                    // Early stopping to avoid unnecessary work
                    if (water > x)
                        break;
                }

                if (water <= x) {

                    ans = mid;
                    low = mid + 1;

                } else {

                    high = mid - 1;

                }

            }

            System.out.println(ans);

        }

    }
}
