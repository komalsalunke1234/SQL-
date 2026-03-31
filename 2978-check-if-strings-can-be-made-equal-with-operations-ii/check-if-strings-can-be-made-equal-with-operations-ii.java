class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n=s1.length();
    
        // HashMap<Character,Integer>even1=new HashMap<>();
        // HashMap<Character,Integer>even2=new HashMap<>();
        // HashMap<Character,Integer>odd1=new HashMap<>();
        // HashMap<Character,Integer>odd2=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(i%2==0){
        //         even1.put(s1.charAt(i),even1.getOrDefault(s1.charAt(i), 0) + 1);
        //         even2.put(s2.charAt(i),even2.getOrDefault(s2.charAt(i), 0) + 1);
        //     }
        //     else{
        //         odd1.put(s1.charAt(i),odd1.getOrDefault(s1.charAt(i), 0) + 1);odd2.put(s2.charAt(i),odd2.getOrDefault(s2.charAt(i), 0) + 1);
        //     }
        // }
        // return (even1.equals(even2) && odd1.equals(odd2));


StringBuilder even1=new StringBuilder();
StringBuilder even2=new StringBuilder();
StringBuilder odd1=new StringBuilder();
StringBuilder odd2=new StringBuilder();
for(int i=0;i<n;i++){
    if(i%2!=0){
        odd1.append(s1.charAt(i));
         odd2.append(s2.charAt(i));


    }
    else{
                even1.append(s1.charAt(i));
                        even2.append(s2.charAt(i));


    }
}

      char[] e1 = even1.toString().toCharArray();
        char[] e2 = even2.toString().toCharArray();
        char[] o1 = odd1.toString().toCharArray();
        char[] o2 = odd2.toString().toCharArray();

        Arrays.sort(e1);
        Arrays.sort(e2);
        Arrays.sort(o1);
        Arrays.sort(o2);

        return Arrays.equals(e1, e2) && Arrays.equals(o1, o2);

    }
}