class Solution {
    public int compareVersion(String ver1, String ver2) {
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();

        String temp = "";
        for(int i=0;i<ver1.length();i++){
            if(ver1.charAt(i)!='.') temp+=ver1.charAt(i);
            if(ver1.charAt(i)=='.' || i==ver1.length()-1){
                v1.add(Integer.valueOf(temp));
                temp="";
            }
        }
        temp = "";
        for(int i=0;i<ver2.length();i++){
            if(ver2.charAt(i)!='.') temp+=ver2.charAt(i);
            if(ver2.charAt(i)=='.' || i==ver2.length()-1){
                v2.add(Integer.valueOf(temp));
                temp="";
            }
        }
        int ans = 0;
        while(!v1.isEmpty()&&!v2.isEmpty()){
            int rev1 = v1.remove(0);
            int rev2 = v2.remove(0);
            if(rev1<rev2) return -1;
            else if(rev1>rev2) return 1;
            else ans = 0;
        }

        while(!v1.isEmpty()){
            int rev1 = v1.remove(0);
            if(rev1<0) return -1;
            else if(rev1>0) return 1;
            else ans = 0;
        }

        while(!v2.isEmpty()){
            int rev2 = v2.remove(0);
            if(0<rev2) return -1;
            else if(0>rev2) return 1;
            else ans = 0;
        }

        return ans;
        
    }
}