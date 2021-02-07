package MixProblems;

import java.util.HashMap;
import java.util.Scanner;

public class Minwindowsub {

	
	
	  public static void main(String args[]) 
	    { 
		  
		 Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();

		  Minwindowsub m = new Minwindowsub();
		  System.out.println(m.minWindow(a,b));
	    }
	
	
	
	
	
    public String minWindow(String s, String t) {
  
       
  
        HashMap<Character,Integer> hasht = new HashMap<>();
        
        for(int i=0;i<t.length();i++)
            if(hasht.containsKey(t.charAt(i)))      
            hasht.put(t.charAt(i),hasht.get(t.charAt(i))+1);
          else
            hasht.put(t.charAt(i),1);

        
       int startindex=-1,endindex=-1; 
        
       //check() 
        
     int min=Integer.MAX_VALUE;   
        int start=0;
        
        for(int end=0;end<s.length();end++)
        {
                      // System.out.println(s.charAt(end));

            while(check(s.substring(start,end+1),hasht))
            {
                
               // System.out.print(s.substring(start,end+1)+"--");
           if(min>end-start+1)
            {
               //System.out.print("@");
                min=end-start+1;
                startindex=start;
                endindex=end;
                
        
            }
                start++;
                //min=Math.min(min,end-start+1); 
        
                    
            }
            
     /*      */
        
        }
        
        
    
      //  System.out.print(startindex+"="+endindex);
        
        if(startindex==-1 && endindex==-1)
            return "";
       return s.substring(startindex,endindex+1); 
        
      
    
    }
    
    
    
    
  boolean  check(String sub, HashMap<Character,Integer> st)
    {
      
       HashMap<Character,Integer> subhash = new HashMap<>();
        
        for(int i=0;i<sub.length();i++)
             subhash.put(sub.charAt(i),subhash.getOrDefault(sub.charAt(i),0)+1);
        
      
             // for(int i=0;i<sub.length();i++)
               for (char x : st.keySet())  
                       if(!(subhash.containsKey(x) && subhash.get(x)>=st.get(x)))   
                               return false;
                   
                   
        
        return true;
        
    }
}

