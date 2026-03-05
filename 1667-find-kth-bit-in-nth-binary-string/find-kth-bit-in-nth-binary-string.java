class Solution {
    public char findKthBit(int n, int k) {
         String s = "0";

        for(int i = 2; i <= n; i++) {

            StringBuilder inverted = new StringBuilder();

            for(char c : s.toCharArray()) {
                if(c == '0')
                    inverted.append('1');
                else
                    inverted.append('0');
            }

            inverted.reverse();

            s = s + "1" + inverted.toString();
        }

        return s.charAt(k - 1);
    }
}