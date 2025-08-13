class Solution {
    public List<Integer> findAnagrams(String s, String p) {
                
        ArrayList<Integer> list = new ArrayList<>();
                if (s.length() < p.length()) return list;  
          int st=0;
        char[]arr1=p.toCharArray();
        Arrays.sort(arr1);
         String str="";
        for(int i=0;i<p.length();i++){
            str=str+s.charAt(i);
        }
        char[]arr2=str.toCharArray();
        Arrays.sort(arr2);
       if (Arrays.equals(arr1, arr2)){
            list.add(0);
        }
        StringBuilder sb=new StringBuilder(str);
        for(int i=p.length();i<s.length();i++)
        {
            st++;
            sb.append(s.charAt(i));
            sb.deleteCharAt(0); 
            char[]arrs=sb.toString().toCharArray();
            Arrays.sort(arrs);
              if (Arrays.equals(arr1, arrs)){
                list.add(st);
              }
        }
               return list;

        }
    }