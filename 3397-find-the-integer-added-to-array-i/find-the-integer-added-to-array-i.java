class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(n!=m) return -1;
        return nums2[0]-nums1[0];

    }
}