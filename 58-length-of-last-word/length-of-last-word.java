class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int cnt = 0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                cnt++;
            }else if(s.charAt(i)==' '&&cnt!=0){
                break;
            }
        }
        return cnt;
    }
}