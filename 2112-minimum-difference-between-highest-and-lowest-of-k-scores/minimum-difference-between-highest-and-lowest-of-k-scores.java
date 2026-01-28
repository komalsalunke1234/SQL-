class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1)return 0;
        Arrays.sort(nums);
        int n=nums.length;
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int min=nums[i];
            int max=nums[i+k-1];
            mindiff=Math.min(mindiff,max-min);
        }
        return mindiff;
    }
}