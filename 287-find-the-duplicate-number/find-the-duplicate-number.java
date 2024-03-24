class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int mid = i+(j-i)/2;
            int cnt = 0;
            for(int num:nums){
                if(num<=mid) cnt++;
            }
            if(cnt>mid) j = mid;
            else i = mid+1;
        }
        return i;
    }
}