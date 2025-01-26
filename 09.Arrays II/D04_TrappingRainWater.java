// Trapping Rain Water
/*
Steps:
    1. Calculate left max Boundary - array
    2. Calculate right max boundary - arrray
    3. loop
    4. waterlevel = min(left max boundary,right max boundary)
    5. trappedwater = (waterlevel - height[i]) * width
 */

public class D04_TrappingRainWater {
    public static void trappedRainWater(int height[],int width){
        int n = height.length;

        // Calculate left max Boundary - array
        int leftmaxboundary[] = new int[n];
        leftmaxboundary[0] = height[0];
        for(int i = 1;i<n;i++){
            leftmaxboundary[i] = Math.max(leftmaxboundary[i-1],height[i]);
        }

        // Calculate right max boundary - arrray
        int rightmaxboundary[] = new int[n];
        rightmaxboundary[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightmaxboundary[i] = Math.max(height[i],rightmaxboundary[i+1]);
        }

        // loop
        int trappedRainWater1 = 0;
        for(int i =0;i<n;i++){
            // waterlevel = min(left max boundary,right max boundary)
            int waterlevel = Math.min(leftmaxboundary[i],rightmaxboundary[i]);
            // trappedwater = (waterlevel - height[i]) * width
            trappedRainWater1 = trappedRainWater1 + (waterlevel - height[i]) * width;
        }

        System.out.println("Trapped RainWater = "+trappedRainWater1);
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        int width = 1;
        trappedRainWater(height, width);
    }
}
