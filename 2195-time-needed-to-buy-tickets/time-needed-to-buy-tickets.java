class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int i = 0;
        while(true){
            if(i==tickets.length) i=0;
            if(tickets[k]==0) break;
            if(tickets[i]!=0){
                tickets[i]--;
                time++;
            }
            i++;
        }
        return time;
    }
}