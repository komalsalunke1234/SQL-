class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            int current=nums1[i];
            int j=0;

            while(j<nums2.length && nums2[j]!=current){
                j++;
            }
            int nextgreater=-1;
            for(j=j+1;j<nums2.length;j++){
                if(nums2[j]>current){
                    nextgreater=nums2[j];
                    break;
                }
            }
            result[i]=nextgreater;
        }
        return result;
    }
}