import java.util.*;
import java.util.Arrays;

public class LeetcodeQuestions2 {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];

    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;
        int[] result = new int[2];
        int[] freq = new int[total + 1];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                freq[grid[i][j]]++;
            }
        }

        for (int i = 1; i <= total; i++) {
            if (freq[i] == 2) {
                result[0] = i;
            } else if (freq[i] == 0) {
                result[1] = i;
            }
        }

        return result;

    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && (nums[i] != nums[i + 1])) {
                {
                    return nums[i];
                }
            }
            if (i == nums.length && (nums[i] == nums[i - 1])) {
                {
                    return nums[i];
                }
            }
            if ((nums[i - 1]) != (nums[i]) && (nums[i]) != (nums[i + 1])) {
                return nums[i];
            }

        }
        return -1;
    }

    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);

            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            double ans = myPow(x, -n);
            return (1 / ans);
        }
        double halfPower = myPow(x, n / 2);
        double halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;

    }

    public void sortColors(int[] nums) {

        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum0++;
            } else if (nums[i] == 1) {
                sum1++;
            } else if (nums[i] == 2) {
                sum2++;
            }
        }

        int count = 0;

        // Add zer0
        for (int i = 0; i < sum0; i++) {
            nums[count] = 0;
            count++;
        }
        for (int i = 0; i < sum1; i++) {
            nums[count] = 1;
            count++;
        }
        for (int i = 0; i < sum2; i++) {
            nums[count] = 2;
            count++;
        }

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threeSum = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lp = i + 1, rp = nums.length - 1;

            while (lp < rp) {
                int sum = nums[i] + nums[lp] + nums[rp];
                if (sum == 0) {
                    threeSum.add(Arrays.asList(nums[i], nums[lp], nums[rp]));

                    while (lp < rp && nums[lp] == nums[lp + 1]) {
                        lp++;
                    }

                    while (lp < rp && nums[rp] == nums[rp - 1]) {
                        rp--;
                    }
                    lp++;
                    rp--;
                } else if (sum > 0) {
                    rp--;
                } else {
                    lp++;
                }
            }

        }

        return threeSum;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> fourSum = new ArrayList<>();
        if (nums.length<4){
            return fourSum;
        }

        for (int i = 0; i < nums.length-3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length-2; j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) {
                continue;
                }

                int lp = j + 1, rp = nums.length - 1;

                while (lp < rp) {
                    long sum = (long)nums[i] + nums[j] + nums[lp] + nums[rp];
                    if (sum == (long)target) {
                        fourSum.add(Arrays.asList(nums[i], nums[j], nums[lp], nums[rp]));

                        while (lp < rp && nums[lp] == nums[lp + 1]) {
                            lp++;
                        }

                        while (lp < rp && nums[rp] == nums[rp - 1]) {
                            rp--;
                        }
                        lp++;
                        rp--;
                    } else if (sum > target) {
                        rp--;
                    } else {
                        lp++;
                    }
                }
            }
        }

        return fourSum;
    }


    // Leet code question number:- 1441
    public List<String> buildArray(int[] target, int n) {
        List<String> result=new ArrayList<>();
        
        int j=0;
        for(int i=1; i<=n; i++){
            result.add("Push");
            if (target[j]==i) {
                j++;
                if (j==target.length) {
                    break;
                }
            }
            else{
                result.add("Pop");
            }
        }
        

        return result;

    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 1 };
        // System.out.println(majorityElement(arr));
        System.out.println(myPow(2, -4));
    }
}
