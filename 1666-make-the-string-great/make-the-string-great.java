class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            char ch = st.peek();
            char ch2 = s.charAt(i);
            if(ch-ch2==32||ch-ch2==-32){
                st.pop();
            }else{
                st.push(ch2);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
        
    }
}