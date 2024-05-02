class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int ans = -1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==0) return nums[j];
            else if(sum>0) j--;
            else i++;
        }
        return ans;
    }
}