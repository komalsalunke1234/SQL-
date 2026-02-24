class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int maxlength=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int row=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    row++;
                }
                    if(row<=k){
                        int length=j-i+1;
                        maxlength=Math.max(maxlength,length);
                    }
                    else{
                        break;
                    
                }
            }
        }
                    return maxlength;

    }
}