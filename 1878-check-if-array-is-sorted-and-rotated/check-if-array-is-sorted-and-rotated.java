class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int next=(i+1)%n;
            if(nums[i]>nums[next]){
                count++;
            }
        }
             return count <= 1;
    }
}