class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i=0;i<word.length();i++){
            if(!flag){
                sb.insert(0,word.charAt(i));
            }else{
                sb.append(word.charAt(i));
            }
            if(ch==word.charAt(i)) flag = true;
        }
        if(!flag) return word;
        return sb.toString();
    }
}