class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        long max=0;
        int c=0,value=0;
        Integer[] hArray = new Integer[h.length];
        for(int i=0; i<h.length; i++){
            hArray[i] = h[i];
        }
        Arrays.sort(hArray, Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            value = hArray[i]-i;
            if(value>0)
            {
                max += value;
            }
        }
        return max;
    }
}
