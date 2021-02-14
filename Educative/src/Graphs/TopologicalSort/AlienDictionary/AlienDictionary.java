package Graphs.TopologicalSort.AlienDictionary;

import java.util.*;

class AlienDictionary {
  public static String findOrder(String[] words) {
    // TODO: Write your code here
	  
	  
   HashMap<Character,ArrayList<Character>> edges = new HashMap<Character, ArrayList<Character>>();
   HashMap<Character, Integer> inDegree = new HashMap<Character, Integer>();
	
   for (String word : words) {
	      for (char character : word.toCharArray()) {
	        inDegree.put(character, 0);
	        edges.put(character, new ArrayList<Character>());
	      }
	    }
   
   
   
   for(int i=0;i<words.length-1;i++)
   {
	   String f = words[i];
	   String s = words[i+1];
	   
	 //  System.out.println(f+"-"+s);
	   int k=0;
	   while(k< s.length() && k <f.length())
	   {
		   if(f.charAt(k)!=s.charAt(k))
		   {
			 //  System.out.println(s.charAt(k));
			   
			   //edges.getOrDefault(f.charAt(k),new ArrayList<Character>()).add(s.charAt(k));
			   ArrayList<Character> l = edges.getOrDefault(f.charAt(k), new ArrayList<Character>());
			   l.add(s.charAt(k));
			   edges.put(f.charAt(k),l);
			   
			   
			   inDegree.put(s.charAt(k),inDegree.getOrDefault(s.charAt(k),0)+1);	   
			   break;
		   }
		   
		   k++;
		   	   
	   }
	   
	   
   }
   
  // System.out.println("--"+inDegree);

   System.out.println(sort(edges,inDegree));
	  
    return "";
  }
  
  
  public static List<Character> sort(HashMap<Character, ArrayList<Character>> edges, HashMap<Character, Integer> inDegree) {
	    List<Character> sortedOrder = new ArrayList<>();
	    // TODO: Write your code here
	     
	  
	    Queue<Character> queue = new  LinkedList<Character>();
	    
	 //   System.out.println(edges.toString());
	  
		//   System.out.println(inDegree);

	         for(Map.Entry<Character, Integer> element : inDegree.entrySet())    
	         {
	        	 if(element.getValue()==0) queue.offer(element.getKey());
	        	 	 
	         }
	     // System.out.println(queue);
	    
	         while(!queue.isEmpty())
	         {
	        	 
	        	 Character poll = queue.poll();
	        	 
	        	sortedOrder.add(poll);
	        	
	        	List<Character> childOfpolled = edges.get(poll);
	        	 for(char c : childOfpolled )
	        	    {
	        		
	        		 inDegree.put(c,inDegree.get(c)-1);
	        	      if(inDegree.get(c)==0)
	        		      queue.offer(c);
	        	    }
	        	 
	        	 
	        	 
	        	 
	         }
	    
	    
	    
	    
	//    System.out.println("--"+sortedOrder); 
	    
	    return sortedOrder;
	  }

  public static void main(String[] args) {
   // String result = AlienDictionary.findOrder(new String[] { "ba", "bc", "ac", "cab" });
   // System.out.println("Character order: " + result);

    //result = AlienDictionary.findOrder(new String[] { "cab", "aaa", "aab" });
   // System.out.println("Character order: " + result);

	  String  result = AlienDictionary.findOrder(new String[] { "ywx", "wz", "xww", "xz", "zyy", "zwz" });
    //System.out.println("Character order: " + result);
  }
}