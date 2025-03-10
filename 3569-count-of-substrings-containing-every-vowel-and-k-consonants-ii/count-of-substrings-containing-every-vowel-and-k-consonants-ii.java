class Solution {
    public long countOfSubstrings(String word, int k) {
        return find(word,k)-find(word,k+1);

    }
    long find(String word, int k ){
        int a=0,e=0,i=0,o=0,u=0,cons=0;

        long count = 0;

        int left=0,right=0;
        int n = word.length();

        while(right<n){
            char ch =word.charAt(right);
            if(ch=='a')
                a++;
            else if(ch=='e')
                e++;
            else if(ch=='i')
                i++;
            else if (ch =='o')
                o++;
            else if(ch=='u')
                u++;
            else
                cons++;

            if(a>0 && e>0 && i>0 && o>0 && u>0 && cons>=k){
                count+=n-right;
            }

            while(left<right && a>0 && e>0 && i>0 && o>0 && u>0 && cons>=k){
                char leftChar =word.charAt(left);
                if(leftChar=='a')
                    a--;
                else if(leftChar=='e')
                    e--;
                else if(leftChar=='i')
                    i--;
                else if (leftChar =='o')
                    o--;
                else if(leftChar=='u')
                    u--;
                else
                    cons--;

                if(a>0 && e>0 && i>0 && o>0 && u>0 && cons>=k){
                    count+=n-right;
                }
                left++;

            }
            right++;

        }
        return count;

    }
}