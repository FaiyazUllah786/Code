class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        List<Integer> li = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i: arr2){
            set.add(i);
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==i){
                    li.add(i);
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
           if(!set.contains(arr1[i])) li.add(arr1[i]);
        }
        
        int[] ans = new int[li.size()];
        int idx = 0;
        for(int i:li){
            ans[idx++] = i;
        }
        return ans;
        
    }
}