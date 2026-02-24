class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            int row=0;
            for(int j=i;j<nums.length;j++)
        {
            if(nums[j]==0){
                row++;
            }
            if(row<=k){
                int len=j-i+1;
                maxlength=Math.max(maxlength,len);
            }
            else{
                break;

            }
        }
        
        }
        return maxlength;
    }
}