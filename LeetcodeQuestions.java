import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class LeetcodeQuestions {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int rainWaterTrap(int[] height) {
        int maxLeft[] = new int[height.length];
        int maxRight[] = new int[height.length];
        maxLeft[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }

        maxRight[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i + 1]);
        }

        int TrappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(maxRight[i], maxLeft[i]);
            TrappedWater += waterLevel - height[i];
        }
        return TrappedWater;
    }

    // Histogram Problem
    public int largestRectangleArea(int[] heights) {
        int Leftsmaller[] = new int[heights.length];
        int Rightsmaller[] = new int[heights.length];

        Leftsmaller[0] = -1;
        for (int i = 1; i < heights.length; i++) {
            Leftsmaller[i] = Math.min(heights[i], Leftsmaller[i - 1]);
        }

        Rightsmaller[heights.length - 1] = heights.length;
        for (int i = 1; i < heights.length; i++) {
            Rightsmaller[i] = Math.min(heights[i], Rightsmaller[i + 1]);
        }
        int maxArea = 0;
        int width;
        int area;

        for (int i = 0; i < heights.length; i++) {
            width = Rightsmaller[i] - Leftsmaller[i] - 1;
            area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;

    }

    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int maxwater = capacity;
        for (int i = 0; i < plants.length; i++) {

            if (capacity < plants[i]) {
                steps = steps + (2 * i + 1);
                capacity = maxwater - plants[i];
            } else {
                capacity = capacity - plants[i];
                steps += 1;
            }

        }
        return steps;
    }

    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int refills = 0;
        int maxwaterA = capacityA;
        int maxwaterB = capacityB;
        for (int i = 0; i < plants.length; i++) {
            if (capacityA < plants[i]) {
                refills += 1;
                capacityA = maxwaterA;
            } else {
                capacityA = capacityA - plants[i];
            }
            for (int j = plants.length - 1; j >= i; j--) {
                if (i == j) {
                    if ((capacityA < capacityB && capacityB < plants[j])
                            || (capacityA > capacityB && capacityA < plants[i])) {
                        refills += 1;
                        return refills;
                    }

                }
                if (capacityB < plants[j]) {
                    refills += 1;
                    capacityB = maxwaterB;
                } else {
                    capacityB = capacityB - plants[j];
                }
            }

        }
        return refills;

    }

    public int minimumRefill2(int[] plants, int capacityA, int capacityB) {
        int i = 0, j = plants.length - 1;
        int refills = 0;
        int currA = capacityA, currB = capacityB;

        while (i <= j) {
            if (i == j) { // both meet at the same plant
                if (Math.max(currA, currB) < plants[i]) {
                    refills++;
                }
                break;
            }

            // Alice waters from left
            if (currA < plants[i]) {
                refills++;
                currA = capacityA;
            }
            currA -= plants[i];
            i++;

            // Bob waters from right
            if (currB < plants[j]) {
                refills++;
                currB = capacityB;
            }
            currB -= plants[j];
            j--;
        }

        return refills;
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public boolean isSameAfterReversals(int num) {
        return true;
    }

    public static boolean isPowerOfTwo(int n) {
        // if (n==1) {
        // return true;
        // }
        // if(n%2!=0 || n<=0){
        // return false;
        // }
        // return isPowerOfTwo(n/2);

        return n > 0 && (n & (n - 1)) == 0;
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1 || n % 3 == 0) {
            return true;
        }
        if (n % 3 != 0 || n <= 0) {
            return false;
        }
        return isPowerOfThree(n / 3);

    }

    public static int triangularSum(int[] nums) {
        int newNums[] = new int[nums.length - 1];

        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = ((nums[i] + nums[i + 1]) % 10);
        }

        return triangularSum(newNums);

    }

    public static double[] convertTemperature(double celsius) {
        double ans[] = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }

    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;

    }

    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                ans++;
            } else if (operations[i].equals("X--") || operations[i].equals("--X")) {
                ans--;
            }
        }

        return ans;
    }

    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            sum += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }
        return sum;
    }

    public int differenceOfSums(int n, int m) {

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else
                num1 += i;
        }
        return num1 - num2;
    }

    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Fuzz");
            } else {

                ans.add(Integer.toString(i));
            }
        }

        return ans;
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        int maxLen = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If character already exists in temp, remove everything up to and including it
            int idx = temp.indexOf(String.valueOf(ch));
            if (idx != -1) {
                temp.delete(0, idx + 1);
            }

            // Add current character
            temp.append(ch);

            // Update max length
            maxLen = Math.max(maxLen, temp.length());
        }

        return maxLen;
    }

    public int kthGrammar(int n, int k) {
        if (k == 1) {
            return 0;
        }

        int parent = kthGrammar(n - 1, (k + 1) / 2);
        if (parent == 0) {
            if (k % 2 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (k % 2 == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int trailingZeroes(int n) {
        int fact = factorial(n);
        int count = 0;
        while (fact > 0) {
            if (fact % 10 == 0) {
                count++;
                fact = fact / 10;
            } else
                break;
        }

        return count;
    }

    class Solution {
        int[] dp = new int[46];

        public int climbStairs(int n) {
            if (n == 0 || n == 1)
                return 1;
            if (dp[n] != 0)
                return dp[n];
            return dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
    class Solution2 {
        int[] dp = new int[31];

    public int fib(int n) {
        if (n==0||n==1) {
            return n;
        }
        if (dp[n] !=0) {
            return dp[n];
        }
        return dp[n]=fib(n-1)+fib(n-2);
    }
}

public boolean isAnagram(String s, String t) {
        for(int i=0; i<s.length(); i++){
            
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result= new int[n+m];

        int p1=m-1,p2=n-1;

        for(int p3=n+m-1; p3>=0 ; p3--){
            int val1=(p1<0)? Integer.MIN_VALUE :nums1[p1];
            int val2=(p2<0)? Integer.MIN_VALUE :nums2[p2];
            if (val1<val2) {
                result[p3]=val2;
                p2--;
            }else{
                result[p3]=val1;
                p1--;
            }

        }
        System.out.println(nums1);
    }


    //MErge Sort Question 
    class Solutions {

    public void mergeSort(int[] arr, int si, int ei){
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge2(arr, si, mid, ei);
    }

    public void merge2(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= ei) temp[k++] = arr[j++];

        // Copy back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}

    // 

    public int[] intersection(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
         Arrays.sort(nums2);

        int i=0,j=0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i<=nums1.length || j<=nums2.length) {
            if (nums1[i]==nums2[j]) {
                if (result.isEmpty()|| result.get(result.size()-1)!=nums1[i]) {
                    result.add(nums1[i]);
                    
                }
                i++;
                j++;
            }else if (nums1[i]>nums2[j]) {
                j++;
            }else{
                i++;
            }
        }

        int [] resultArr=new int[result.size()];
        for(int k=0; k<result.size(); k++){
            resultArr[k]=result.get(k);
        }

        return resultArr;
        
        }
    

    public static void main(String[] args) {
        // System.out.println(isPowerOfThree(9));;
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(triangularSum(arr));
    }
}
