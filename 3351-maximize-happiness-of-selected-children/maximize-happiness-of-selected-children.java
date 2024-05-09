class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        long max = 0;
        int c = 0, value = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : h) {
            pq.offer(num);
        }
        
        for (int i = 0; i < k; i++) {
            int top = pq.poll();
            value = top - c++;
            if (value > 0) {
                max += value;
            }
            if (pq.isEmpty()) {
                break;
            }
        }
        
        return max;

    }
}
