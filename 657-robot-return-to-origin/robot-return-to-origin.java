class Solution {
    public boolean judgeCircle(String moves) {
        int countl=0;
        int countr=0;
        int countu=0;
        int countd=0;
        for(int i=0;i<moves.length();i++){
                if(moves.charAt(i)=='L' )countl++;
                if(moves.charAt(i)=='R' )countr++;
                if(moves.charAt(i)=='U' )countu++;
                if(moves.charAt(i)=='D' )countd++;
        }
        return countl == countr && countu == countd;
    }
    
}