class Solution {
    public boolean check(String res,String temp)
    {
        return res.compareTo(temp)<0;
    }
    public String answerString(String word, int numFriends) 
    {
        if(numFriends==1)
        return word;
        int max=0;

        for(char a:word.toCharArray())
        {
            max=Math.max(max,a-'a');
        }
        char temp=(char)(max+'a');
         
        int remaining=word.length()-(numFriends-1); 
        String res="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==temp)
            {
                String t=word.substring(i,i+Math.min(remaining,word.length()-i));
                if(check(res,t))
                {
                    res=t;
                }
            }
        }
        return res;

    }
}