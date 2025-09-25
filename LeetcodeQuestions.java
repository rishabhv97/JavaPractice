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

    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int maxwater=capacity;
        for(int i=0; i<plants.length ;i++){
            
            if (capacity<plants[i]) {
                steps=steps+(2*i+1);
                capacity=maxwater-plants[i];
            }
            else{
                capacity=capacity-plants[i];
                steps+=1;
            }
            
        }
        return steps;
    }
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int refills=0;
        int maxwaterA=capacityA;
        int maxwaterB=capacityB;
        for(int i=0; i<plants.length ;i++){
            if (capacityA<plants[i]) {
                refills+=1;
                capacityA=maxwaterA;
            }else{
                capacityA=capacityA-plants[i];
            }
            for(int j=plants.length-1; j>=i; j--){
                if (i==j) {
                    if ((capacityA<capacityB && capacityB<plants[j]) || (capacityA>capacityB && capacityA<plants[i])) {
                        refills+=1;
                        return refills;
                    }
                    
                    
                }
                if (capacityB<plants[j]) {
                refills+=1;
                capacityB=maxwaterB;
                }else{
                capacityB=capacityB-plants[j];
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

    public static void main(String[] args) {
        
    }
}
