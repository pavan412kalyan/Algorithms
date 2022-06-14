package ComparatorDemo;

import java.util.*;
 class TreeNode {
    int val;
    TreeNode left;
   TreeNode right;
    TreeNode() {}
   TreeNode(int val) { this.val = val; }
   TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;        this.left = left;
       this.right = right;
    }
}

public class ComparatorSort {

	
	
	
}




class SortNode implements Comparator<Node>{
    
    public int compare(Node a, Node b) 
   { 
       
       return a.x==b.x ? a.y==b.y ? a.val-b.val : b.y-a.y : a.x-b.x;
        
             
   } 
   
     
}

class Node{
   
   int x,y,val;
   
   public Node(int x,int y,int val)
   {
       this.x=x;
       this.y=y;
       this.val=val;
       
   }
   
}


class Solution {
   
   
   List<Node> nodes = new  ArrayList();
   
   public List<List<Integer>> verticalTraversal(TreeNode root) {
     
       traverse(root,0,0);
       
       
       Collections.sort(nodes, new SortNode()); 
       
       //Collections.sort(nodes,(a,b)-> a.x==b.x ? a.y==b.y ? a.val-b.val : b.y-a.y : a.x-b.x ); 

       
    TreeMap<Integer,List<Integer>> map = new TreeMap();
       
       for(Node d : nodes)
       {
           List<Integer> list= map.getOrDefault(d.x, new ArrayList<Integer>());
           
           list.add(d.val);
           map.put(d.x,list);
                    
       }
       
       
       
  
       
       List<List<Integer>> ans = new ArrayList();
       
       for(List<Integer> x : map.values())
       {
           ans.add(x);
           
           
       }
       
       
       
       return ans;
   }
   
   
   void traverse(TreeNode root, int x , int y)
   {
     if(root==null)
         return;
       
     nodes.add(new Node(x,y,root.val));  
       
       traverse(root.left,x-1,y-1);
       traverse(root.right,x+1,y-1);
       
       
       
   }
   
   
}
