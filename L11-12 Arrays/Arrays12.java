public class Arrays12 {

    public static void maxSubarrays(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];

        for(int i=1;i<prefix.length ;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0; i< numbers.length ;i++){
            int start=i;
            for(int j=i; j<numbers.length ;j++){
                int end=j;
                currSum = start==0? prefix[end] : prefix[end]-prefix[start-1];
                if (maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        } 
       System.out.println("Max of Subarray is: "+maxSum);
    }

    public static void kadanes(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs =0;

        for(int i=0; i<numbers.length; i++){
            cs= cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Max Sum is : "+ ms);
    }

    public static void kadanesWithNegative(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs =0;

        for(int i=0; i<numbers.length; i++){
            cs= cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }

        if (ms==0) {
            int sm=numbers[0];
            for(int i=0; i<numbers.length ; i++){
                if (sm<numbers[i]) {
                    sm=numbers[i];
                }

            }
        }
        System.out.println("Our Max Sum is : "+ ms);
    }

    public static int trappedRainwater(int height[]){
        // calculate left max boundary - array
        int leftMax[]= new int[height.length];
        leftMax[0]=height[0];
        for(int i=1; i<height.length ;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        
        // calculate right max boundary- array
        int rightMax[]= new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2; i>=0 ;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater =0;
        for(int i=0; i<height.length;i++){
            int waterLevel=Math.min(rightMax[i], leftMax[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice< prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static int trap(int[] height) {
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

    public static void main(String[] args) {
        // int numbers[]={2,4,6,8,10};
        int height[]={4,2,0,6,3,2,5};
        // int price[]={7,1,5,3,6,4};

        // System.out.println(buyAndSellStocks(price));
        System.out.println(trap(height));

        

       

        // maxSubarrays(numbers);
    //    System.out.println(trappedRainwater(height));
    }
}
