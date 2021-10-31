class Solution {
    public int trap(int[] height) {
     int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;
        while (left < right) {
            if (height[left] >= height[right]) {
                if (rightMax > height[right]) {
                    ans += rightMax-height[right];
                } else {
                    rightMax = height[right];
                }
                right--;
            } else {
                if (leftMax > height[left]) {
                    ans += leftMax-height[left];
                } else {
                    leftMax = height[left];
                }
                left++;
            }
        }
        return ans; 
    }
}
