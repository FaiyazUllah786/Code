class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans = 0;
        int j = 0;
        for(int i=happiness.length-1;i>=0;i--){
            int val = happiness[i]-j++;
            if(val>0 && k>0){
                ans+=val;
                k--;
                // System.out.println(val);
            } 
            // System.out.println(val+"i");
        }
        return ans;
    }
}