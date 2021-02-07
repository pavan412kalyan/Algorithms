package Graphs2;

import java.util.HashMap;
/* class TrieNode{
       
  char letter;
  //HashMap<Character,TrieNode> children= new HashMap<>();
     TrieNode[] children = new TrieNode[26];
  boolean isword;
  
  TrieNode(char letter)
  {
	  this.letter=letter;

  }
    }*/

class TrieNode
{
  char letter;
  HashMap<Character,TrieNode> children= new HashMap<>();
  boolean isword;
  
  TrieNode(char letter)
  {
	  this.letter=letter;

  }


}


public class Tries {
	
	
	TrieNode headnode;

	
	public Tries() {
		headnode = new TrieNode('@');
	}


	
	void insert(String word)
	{
		TrieNode current = headnode;
		
		for(char ch :word.toCharArray())
		{   
			if(!current.children.containsKey(ch))
			{
				current.children.put(ch,new TrieNode(ch));
			}
			
				current=current.children.get(ch);
 
		
			System.out.println(current.letter);

			
		}
		
		current.isword=true;
				
		
	}
	
	/* public void insert(String word) {
        
		TrieNode current = headnode;
		
		for(char ch :word.toCharArray())
		{   
			if(current.children[ch-'a']==null)
			{
				//current.children.put(ch,new TrieNode(ch));
                current.children[ch-'a']= new TrieNode(ch);
			}
			
				current=current.children[ch-'a'];
 
		
			//System.out.println(current.letter);

			
		}
		
		current.isword=true;
				
        
        
        
    }*/
	

	boolean search(String word)
	{
		TrieNode current = headnode;
		for(char ch : word.toCharArray())
		{  
			if(!current.children.containsKey(ch))
			        return false;
			else
				{  
				  current=current.children.get(ch);
				
				}
		}
		System.out.println(current.letter);
			
		
		return current.isword;
		
		
		
	}
	
	
	/*public boolean search(String word) {
        
TrieNode current = headnode;
		for(char ch : word.toCharArray())
		{  
			if(current.children[ch-'a']==null)
			        return false;
			else
				{  
				current=current.children[ch-'a'];
				
				}
		}
		//System.out.println(current.letter);
			
		
		return current.isword;        
        
    }*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		//Tries trie = new Tries();
		//insert("abc",trie);
		
		Tries mytrie = new Tries();
		  mytrie.insert("pavan");
		  System.out.println(mytrie.search("pavan"));
		
		
	}

}
