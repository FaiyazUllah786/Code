class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans = 0;
        int j = 0;
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            int val = happiness[i]-j++;
            if(val>0){
                ans+=val;
            } 
        }
        return ans;
    }
}