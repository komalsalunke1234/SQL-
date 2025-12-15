class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> hash=new HashSet<>();
        for(int i=0;i<friends.length;i++){
            hash.add(friends[i]);
        }
        List<Integer>list=new ArrayList<>();
        for(int j=0;j<order.length;j++){
        if(hash.contains(order[j])){
            list.add(order[j]);
        }
        }
        int ans[]=new int [list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
      return ans;
    }
}