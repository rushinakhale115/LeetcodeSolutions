class Solution {
    public int minimumRecolors(String blocks, int k) {
        int w = 0;
        for(int i=0; i<k; i++) {
            if(blocks.charAt(i) == 'W') {
                w++;
            }
        }
        int res = w;
        for(int i=k; i<blocks.length(); i++) {
            if(blocks.charAt(i) == 'W') {
                w++;
            }
            if(blocks.charAt(i-k) == 'W') {
                w--;
            }
            res = Math.min(res, w);
        }
        return res;
    }
}