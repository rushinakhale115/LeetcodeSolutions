class Solution {
    public int maxDiff(int num) 
    {
        String s1 = Integer.toString(num);
		
		String s2 = Integer.toString(num);
		
		char c = '0';
		
		int n = s1.length();
		
		for(int i=0;i<n;i++)
		{
			if(s1.charAt(i)!='9')
			{
				c = s1.charAt(i);
				break;
			}
		}
		
		s1 = s1.replace(c, '9');
		
		for(int i=0;i<n;i++)
		{
			if(i==0 && s2.charAt(i)!='1')
			{
				c=s2.charAt(i);
				s2 = s2.replace(c, '1');
				break;
			}
			
			else if(i!=0 && s2.charAt(i)!='0' && s2.charAt(i)!=s2.charAt(0))
			{
				c=s2.charAt(i);
				s2 = s2.replace(c, '0');
				break;
			}
		}
        
		return Integer.valueOf(s1)-Integer.valueOf(s2);        
    }
}