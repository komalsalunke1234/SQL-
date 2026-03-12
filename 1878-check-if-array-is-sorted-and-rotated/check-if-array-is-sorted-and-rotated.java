class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        for(int k=0;k<n;k++){
            boolean  match=true;
            for(int i=0;i<n;i++){
            if(nums[i]!=sorted[(i+k)%n]){
                match=false;
                break;

            }
            }
            if(match)return true;
        }
        return false;
    }
}