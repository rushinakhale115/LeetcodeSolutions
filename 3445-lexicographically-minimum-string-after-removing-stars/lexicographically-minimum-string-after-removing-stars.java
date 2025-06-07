class Solution {
    public String clearStars(String s) 
    {
        if(!s.contains("*")) return s;
                
		List<List<Integer>> charPos = new ArrayList<List<Integer>>();
		
		for(int i=0;i<26;i++)
			charPos.add(new ArrayList<Integer>());
		
		char arr[] = s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='*')
			{
				for(int j=0;j<26;j++)
				{
					if(!charPos.get(j).isEmpty())
					{
						int pos = charPos.get(j).removeLast();
						arr[pos] = '*';
						
						break;
					}
				}
			}
			
			else
			{
				charPos.get(arr[i]-'a').add(i);
			}
		}
		
		StringBuilder res = new StringBuilder();
		
		for(char c: arr)
		{
			if(c!='*')
				res.append(c);
		}
		
		return res.toString();        
    }
}