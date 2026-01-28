// Trapping Rain Water

// Given n non-negative integers representing an elevation map where the width of each bar is 1, 
// compute how much water it can trap after raining.

public class trappingRainWaterProblem {

    public static int trappingRainWater(int height[]) {
        int trappedWater = 0;
        int n = height.length;

        // Largest Left Boundary
        int leftMax[] = new int[n]; 
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // Largest Right Boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        
        for (int i = 0; i < n; i++) {
            // Water Level = min(rightMax boundary, leftMax boundary)
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            // Trapped Water = Water Level - Height
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRainWater(arr));
    }
}
