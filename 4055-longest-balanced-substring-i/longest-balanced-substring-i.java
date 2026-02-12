class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            int distinct=0;
            int maxfreq=0;
            for(int j=i;j<n;j++){
                int inx=s.charAt(j)-'a';
                if(freq[inx]==0){
                    distinct++;
                }
                freq[inx]++;
                maxfreq=Math.max(maxfreq,freq[inx]);
                int len=j-i+1;
                if(distinct*maxfreq==len){
                        ans=Math.max(ans,len);
                      
        }
    }
}
return ans;
}
}