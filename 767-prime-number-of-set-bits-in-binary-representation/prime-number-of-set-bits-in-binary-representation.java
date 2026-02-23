class Solution {
    public int countPrimeSetBits(int left, int right) {
       int totalcount=0;
       for(int i=left;i<=right;i++){
        String binary=Integer.toBinaryString(i);
        int count=0;
        for(int j=0;j<binary.length();j++){
            if(binary.charAt(j)=='1'){
                count++;
            }
        }
        if(isPrime(count)){
            totalcount++;
        }
       }
       return totalcount;
    }

    public boolean isPrime(int n){
        if(n<2)return false;
        for(int k=2;k*k<=n;k++){
            if(n%k==0)return false;
        }
        return true;
    }
}