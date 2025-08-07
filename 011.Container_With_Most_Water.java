class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length;
        while(l < r) {
            int tmp = (r - l + 1) * Math.min(height[l], height[r]);
            if (tmp > res) {
                res = tmp;
            }
            if(height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}