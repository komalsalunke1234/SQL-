class Solution {
    public String minWindow(String s, String t) {

        if(s.length()<t.length())return "";
        int l=0;
        int minlen=Integer.MAX_VALUE;
        int startindex=0;
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
         for (char i : t.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)>=0){
                    count++;
                }
            }
            while(count==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    startindex=l;
                }
                char leftchar=s.charAt(l);
            
                if(map.containsKey(leftchar)){
                    map.put(leftchar,map.get(leftchar)+1);
                    if(map.get(leftchar)>0){
                        count--;
                    }
                }
                l++;
            }
        }
       return minlen == Integer.MAX_VALUE 
       ? "" 
       : s.substring(startindex, startindex + minlen);

    }
}