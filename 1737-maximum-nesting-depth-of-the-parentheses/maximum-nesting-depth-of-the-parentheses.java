class Solution {
    public int maxDepth(String s) {
        int cnt = 0;
        int maxCnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                cnt++;
                if(maxCnt<cnt) maxCnt = cnt;
            }else if(ch == ')'){
                cnt--;
            }
        }
        return maxCnt;
    }
}