class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;   
        for(int i:nums){
            max=Math.max(max,i);
        }
        long left = 0, right = 0, ans = 0,count = 0;
        while (right < nums.length || left > right) {
            if (nums[(int)right] == max) {
                count++;
            }
            // If count is greater than or equal to k, calculate subarrays count
            while (count >= k) {
                if (nums[(int)left] == max) {
                    count--;
                }
                left++;
                ans += nums.length - right;
            }
            right++;
        }
        return ans;
    }
}