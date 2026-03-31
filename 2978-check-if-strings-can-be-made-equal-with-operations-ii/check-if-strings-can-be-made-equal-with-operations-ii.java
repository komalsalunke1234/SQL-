class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n=s1.length();
    
        HashMap<Character,Integer>even1=new HashMap<>();
        HashMap<Character,Integer>even2=new HashMap<>();
        HashMap<Character,Integer>odd1=new HashMap<>();
        HashMap<Character,Integer>odd2=new HashMap<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                even1.put(s1.charAt(i),even1.getOrDefault(s1.charAt(i), 0) + 1);
                even2.put(s2.charAt(i),even2.getOrDefault(s2.charAt(i), 0) + 1);
            }
            else{
                odd1.put(s1.charAt(i),odd1.getOrDefault(s1.charAt(i), 0) + 1);odd2.put(s2.charAt(i),odd2.getOrDefault(s2.charAt(i), 0) + 1);
            }
        }
        return (even1.equals(even2) && odd1.equals(odd2));


    }
}