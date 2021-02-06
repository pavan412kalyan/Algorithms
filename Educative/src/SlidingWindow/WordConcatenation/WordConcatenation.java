package SlidingWindow.WordConcatenation;
/*Given a string and a list of words, find all the starting indices of substrings in 
 * the given string that are a concatenation of all the given words exactly once without any overlapping of words.
 *  It is given that all words are of the same length.

Example 1:

Input: String="catfoxcat", Words=["cat", "fox"]
Output: [0, 3]
Explanation: The two substring containing both the words are "catfox" & "foxcat".*/


import java.util.*;

class WordConcatenation {
  public static List<Integer> findWordConcatenation(String str, String[] words) {
   
	
	  
	  
	  
	  
	  return null;
	  
  }

  public static void main(String[] args) {
    List<Integer> result = WordConcatenation.findWordConcatenation("catfoxcat", new String[] { "cat", "fox" });
    System.out.println(result);
    result = WordConcatenation.findWordConcatenation("catcatfoxfox", new String[] { "cat", "fox" });
    System.out.println(result);
  }
}