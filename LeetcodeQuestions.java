public class LeetcodeQuestions {
    public int countPairs(int[] nums, int k) {
        int count=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j] && (i*j)%k==0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int rainWaterTrap(int[] height) {
        int maxLeft[]=new int[height.length];
        int maxRight[]=new int[height.length];
        maxLeft[0]=height[0];
        for(int i=1; i<height.length;i++){
            maxLeft[i]=Math.max(height[i],maxLeft[i-1]);
        }

        maxRight[height.length-1]=height[height.length-1];

        for(int i= height.length-2; i>=0; i--){
            maxRight[i]=Math.max(height[i],maxRight[i+1]);
        }

        int TrappedWater=0;
        for(int i=0; i<height.length ;i++){
            int waterLevel=Math.min(maxRight[i],maxLeft[i]);
            TrappedWater+=waterLevel-height[i];
        }
        return TrappedWater;
    }

// Histogram Problem
    public int largestRectangleArea(int[] heights) {
        int Leftsmaller[]=new int[heights.length];
        int Rightsmaller[]=new int[heights.length];

        Leftsmaller[0]=-1;
        for(int i=1;i<heights.length; i++){
            Leftsmaller[i]=Math.min(heights[i],Leftsmaller[i-1]);
        }

        Rightsmaller[heights.length-1]=heights.length;
        for(int i=1;i<heights.length; i++){
            Rightsmaller[i]=Math.min(heights[i],Rightsmaller[i+1]);
        }
        int maxArea=0;
        int width;
        int area;

        for(int i =0; i<heights.length; i++){
            width = Rightsmaller[i] - Leftsmaller[i] - 1;
            area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
        
    }
    public static void main(String[] args) {
        
    }
}
