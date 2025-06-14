class Solution {
    public int minMaxDifference(int num) {
        String nums=Integer.toString(num);
        char replacevalue=' ';
        for(int i=0;i<nums.length();i++){
            char digit=nums.charAt(i);
            if(digit!='9')
            {
                replacevalue=digit;
                break;
            }
        }
            String maxStr=nums.replace(replacevalue,'9');
            String minStr=nums.replace(nums.charAt(0),'0');
            int max=Integer.parseInt(maxStr);
            int min=Integer.parseInt(minStr);
             return max-min;
        }
       
    }
