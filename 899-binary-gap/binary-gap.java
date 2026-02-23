class Solution {
    public int binaryGap(int n) {
        int maxdistance=0;
        int previnx=0;
        String binary=Integer.toBinaryString(n);
        for(int i=0;i<binary.length();i++){
        if(binary.charAt(i)=='1'){
            if(previnx!=-1){
            int distance=i-previnx;
            maxdistance=Math.max(maxdistance,distance);
        }
        previnx=i;
        }
            }
            return maxdistance;
        }
        
    }
