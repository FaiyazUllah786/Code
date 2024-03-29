class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=1;i<2e31;i++){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}