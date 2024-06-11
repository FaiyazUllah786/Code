class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i:arr2){
            set.add(i);
            int rep = map.get(i);
            for(int j=0;j<rep;j++){
                li.add(i);
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if(!set.contains(arr1[i])) li.add(arr1[i]);
        }
        int[] ans = new int[li.size()];
        for(int i=0;i<li.size();i++){
            ans[i] = li.get(i);
        }
        
        return ans;
    }
}