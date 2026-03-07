class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            q.offer(stone);
        }
        while(q.size()>1){
            int first=q.poll();
            int second=q.poll();
            if(first-second>0){
                q.offer(first-second);
            }
        }
        return q.isEmpty()?0:q.peek();
    }
}