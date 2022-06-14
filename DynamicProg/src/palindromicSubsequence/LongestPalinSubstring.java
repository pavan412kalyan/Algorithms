package palindromicSubsequence;

class LongestPalinSubstring {
	  public int findLPSLength(String st) {
	  return  findLPSLengthRecursive(st, 0, st.length()-1);
	   
			   
	  }

	  private int findLPSLengthRecursive(String st, int startIndex, int endIndex) {
	    
		  if(startIndex>endIndex)
		       return 0;
		  
		  if(startIndex==endIndex)
		      return 1;
		  if(st.charAt(startIndex)==st.charAt(endIndex))
		  {
			  
			  //same as subsequence problem , to be a substring remaining total length  must be palind
			  int remainingLength = endIndex - startIndex -1;
			  
			  if(remainingLength==findLPSLengthRecursive(st,startIndex+1,endIndex-1))
			  {
				 
				  return 2  + remainingLength;
			  }
			  
			  
			  
			  
		  }
		  
		  
		  int choice1 =findLPSLengthRecursive(st,startIndex+1,endIndex);
		  int choice2 =findLPSLengthRecursive(st,startIndex,endIndex-1);
		  
	
			  
		  return Math.max(choice1, choice2);
		  
		  
	  }

	  public static void main(String[] args) {
	    LongestPalinSubstring longestPalinSubstring = new LongestPalinSubstring();
	    System.out.println(longestPalinSubstring.findLPSLength("abdbca"));
	    System.out.println(longestPalinSubstring.findLPSLength("cddpd"));
	    System.out.println(longestPalinSubstring.findLPSLength("pqr"));
	  }
	}