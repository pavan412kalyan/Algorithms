package palindromicSubsequence;

class CPS {

	  public int findCPS(String st) {
	    
		  return findLPSLengthRecursive(st, 0, st.length()-1);
	  }

	  private int findLPSLengthRecursive(String st, int startIndex, int endIndex) {
	   
		  
		  // if 1st letter is equal to last then 2  + remaining sequence
		  // else  check other two choices decrement last st letter or increment 1st letter
		  
		  System.out.println(st.substring(startIndex, endIndex+1));
		  
		  if(startIndex==endIndex)
		       return 1;
		  if(startIndex>endIndex)
		        return 0;
		  
		  if(st.charAt(startIndex)==st.charAt(endIndex))
		  {
			  
			  return 1 + findLPSLengthRecursive(st,startIndex+1, endIndex-1);
			  
		  }
		  
		  int choice1 = findLPSLengthRecursive(st,startIndex+1,endIndex);//without start
		  
		  int choice2 =findLPSLengthRecursive(st,startIndex,endIndex-1); //wihtout end  
		  return Math.max(choice1, choice2);
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  }
	  public static void main(String[] args) {
	    CPS cps = new CPS();
	    System.out.println(cps.findCPS("abdbca"));
	    System.out.println(cps.findCPS("cdpdd"));
	    System.out.println(cps.findCPS("pqr"));
	  }
	}