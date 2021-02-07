package MixProblems;

/**
 * @author vikky
 *
 */
public class BinarySearchTree {
	BinarySearchTree bst ;
	class Node
	{
		int key,count;
		Node left,right;
		
		Node(int key)
		{
			this.key=key;
			left=null;
			right=null;
		}
	
	}
	
	Node root ;
	
	
	
	void put(int key)
	{
		root=put(root,key);
		
	}
	
	public BinarySearchTree() {
     root = null;
      }

	Node put(Node root,int key)
	{
      Node node = new Node(key);
      
      if(root==null) return node;
      if(key>root.key)
    	  root.right=put(root.right,key);
      else
    	  root.left=put(root.left,key);
      root.count=1+subtreecount(root.right)+subtreecount(root.left);
     return root;
		
		
	}
	
	
	
	boolean search(int key)
	{  Node x =root;
	    System.out.println(root.key);
		return search(key,x);
		
	}
	
	boolean search(int key,Node x){
		
		 if(x==null) return false;

		 else if(x.key==key) return true;
		
		else if(key>x.key)	
			return search(key,x.right);
		else  			
			return search(key,x.left);
		//return false;
		
		
	/*	
		while(x!=null)
		{
			
			if(x.key==key) return true;
			
			else if(key>x.key)
				x=x.right;
			else x=x.left;
			
			
		}
		
		return false; */
		
	}
	
	void inorder(Node x)
	{
		if(x!=null)
		{	
		inorder(x.left);
		System.out.println(x.key);
		inorder(x.right);
		
		}
	
	}
	
	void preorder(Node x)
	{
		if(x!=null)
		{	
		System.out.println(x.key);
		preorder(x.left);

		preorder(x.right);
		
		}
	
	}
	void postorder(Node x)
	{
		if(x!=null)
		{	
		postorder(x.left);

		postorder(x.right);
		System.out.println(x.key);

		
		}
	
	}
	
	int subtreecount(Node x)
	{   
		if(x==null)
			return 0;
		return 1 + subtreecount(x.left) + subtreecount(x.right);
			
		
	}
	
	
	int  max(Node x)
	{
		/*while(x.right!=null)
		{
			x=x.right;
			
		}
		
		return x.key; */
		
		if(x.right==null)
			return x.key;
		else 
			return max(x.right);
	
	}
	
	
	int rank(int key,Node x)
	{
		if(x==null)
		return 0;
		
		if(key==x.key)
			return 1+subtreecount(x.left);
		else if(key<x.key)
			return rank(key,x.left);
		else 
			return 1+ subtreecount(x.left) +rank(key,x.right);
			
			
		
		
	}
	
	int height(Node x)
	{
		
		if(x==null) return 0;
		else return 1+Math.max(height(x.left),height(x.right));
		
		
		
		
	}
	
	
	void  deletemin(Node x)
	{
		Node p=x;
		while(x.left!=null)
		{  p=x;
			x=x.left;	
			
		}
		p.left=null; 
		p.right=x.right;
		
	
		
	}
	
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        
        
        if(root==null)
          return root;
        if(root==p || root==q)
            return root;
        Node left =  lowestCommonAncestor(root.left,p,q);
        Node right =  lowestCommonAncestor(root.right,p,q);
        
        if(right!=null && left!=null)
               return root;
        if(left==null && right==null) 
               return null;
        if(right!=null && left==null)
               return right;
      
         //if(right==null && left!=null)
               return left;
        
        
    }
    
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst = new BinarySearchTree();
		
	//	bst.put(12);
		//bst.put(6);
		//bst.put(7);
		
		int[] input = new int[] {3,9,20,15,7};
		
		for(int i : input)
			bst.put(i);

		
		
//System.out.println(bst.search(50,bst.root));
//System.out.println(bst.root.count);

 // bst.inorder(bst.root);
//System.out.println(bst.subtreecount(bst.root));
//System.out.println(bst.max(bst.root));
//System.out.println(bst.rank(69,bst.root));
//  System.out.println(bst.height(bst.root));
bst.postorder(bst.root);
System.out.println("==="); 
bst.deletemin(bst.root); 
 bst.postorder(bst.root);
//System.out.println(bst.root.key);
 
  
  
	}

}
