class Solution {
    public int minimumCost(int[] nums) {
        // int n=nums.length;
        // int x=0
        // for(int i=0;i<n;i++){
        //     if(n==3){
        //         x+=nums[i];
        //     }

        // }


        int first=nums[0];
        Arrays.sort(nums,1,nums.length);// 5 4 3 2
        return first+nums[1]+nums[2];
    }
}