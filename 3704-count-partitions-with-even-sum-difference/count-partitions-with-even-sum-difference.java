class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int totalsum=0;
        for(int x:nums)totalsum+=x;
        int leftsum=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            int rightsum=totalsum-leftsum;
            int diff=Math.abs(rightsum-leftsum);
            if(diff%2==0) count++;
        }
        return count;
    }
}