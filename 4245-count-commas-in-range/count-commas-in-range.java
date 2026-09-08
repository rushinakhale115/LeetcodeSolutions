class Solution {
    public int countCommas(int n) {
        int count=0;
        if(n<999) return 0;
        else if(n<=99999) return n-999;
        else return 99001;

    }
}