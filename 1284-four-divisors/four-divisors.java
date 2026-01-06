class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            int sum=0;

            for(int j=1;j*j<=num;j++){
                if(num%j==0){
                    int d1=j;
                    int d2=num/j;
                    count++;
                    sum+=d1;
                    if(d1!=d2){
                        count++;
                        sum+=d2;

                    }
                    if(count>4)break;
                }
            }
            if(count==4){
                totalsum+=sum;
            }
        }
        return totalsum;
    }
}