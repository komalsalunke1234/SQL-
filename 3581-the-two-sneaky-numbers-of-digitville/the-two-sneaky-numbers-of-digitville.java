class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] temp=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            boolean isduplicate=false;
            for(int j=0;j<i;j++){

                if(nums[i]==nums[j]){
                    isduplicate=true;
                    break;
                }
            }
            if(!isduplicate){
                for(int k=i+1;k<nums.length;k++){
                    if(nums[i]==nums[k]){
                        temp[index++]=nums[i];
                        break;
                    }
                }
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
return result;
        
    }
  
}