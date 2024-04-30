class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int openCnt = 0;
        
        for(int i=0;i<s.length();i++){
            if(arr[i]=='('){
                openCnt++;
            }else if(arr[i]==')'){
                if(openCnt==0){
                    arr[i]='*';
                }else{
                    openCnt--;
                }
            }
        }
        
        for(int i=arr.length-1;i>=0 && openCnt>0;i--){
            if(arr[i]=='('){
                arr[i]='*';
                openCnt--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch:arr){
            if(ch!='*') sb.append(ch);
        }
        
        return sb.toString();
        
    }
}