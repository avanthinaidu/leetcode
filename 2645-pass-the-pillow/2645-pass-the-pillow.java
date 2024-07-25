class Solution {
    public int passThePillow(int n, int time) {
        int count=1;
        while(time>0){
            while(count<n && time>0){
            count++;
            time--;
            }
            while(count>1&&time>0){
                count--;
                time--;
            }
        }
       return count; 
    }
}