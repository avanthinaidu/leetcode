class Solution {
    public long minimumSteps(String s) {
        long ans=0;
        int bc=0;//blackcount(bc)
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='0'){
                ans+=bc;
            }
            else{
                bc++;
            }
        }
        return ans;

        
    }
}