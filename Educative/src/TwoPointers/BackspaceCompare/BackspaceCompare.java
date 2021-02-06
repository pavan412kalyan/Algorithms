package TwoPointers.BackspaceCompare;

import java.util.Stack;

class BackspaceCompare {
//check educativ for actual solution
  public static boolean compare(String str1, String str2) {
    
	  Stack<Character> s1 = new Stack<Character>();
	  Stack<Character> s2 = new Stack<Character>();

	  for(char ch : str1.toCharArray())
	  {
		  if(ch=='#' && !s1.isEmpty())s1.pop();
		  else
			  s1.push(ch);
		  
		  
	  }
	  
	  for(char ch : str2.toCharArray())
	  {
		  if(ch=='#' && !s2.isEmpty())s2.pop();
		  else
			  s2.push(ch);
		  
		  
	  }
	  
	  
	  
	  
	  return s1.equals(s2)?true:false;
  }

  public static void main(String[] args) {
    System.out.println(BackspaceCompare.compare("xy#z", "xzz#"));
    System.out.println(BackspaceCompare.compare("xy#z", "xyz#"));
    System.out.println(BackspaceCompare.compare("xp#", "xyz##"));    
    System.out.println(BackspaceCompare.compare("xywrrmp", "xywrrmu#p"));
  }
}