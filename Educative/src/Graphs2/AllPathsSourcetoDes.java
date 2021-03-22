package Graphs2;
import java.util.*;
class AllPathsSourcetoDes {
    static List<List<Integer>> ans;
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans= new ArrayList<>();
        
        
        List<List<Integer>> edges = new ArrayList();
        
        
        
        for(int i=0;i<graph.length;i++)
        {
            
            List<Integer> list = new ArrayList();
            
            for(int child : graph[i])
            {
                
                list.add(child);
                
            }
            
            edges.add(list);
            
            
            
            
        }
        
        
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        dfs(edges,0,graph.length-1,new HashSet<Integer>(),res );
        
        return ans;
        
    }
    
    
    
    static void dfs(List<List<Integer>> edges,int src,int des , Set<Integer> set,List<Integer> res )
    {

           if(src==des)
           {
               
               ans.add(new ArrayList<Integer>(res));
               return;
               
           }
        
             set.add(src);
        
        
        
        
          for(int  child : edges.get(src))
          {
              
               if(!set.contains(child))
               {
                   
                   res.add(child);
                   dfs(edges,child,des,set,res);
                   res.remove(res.size()-1);
                   
                   
                   
               }
              
              
                            
              
          }      
         
        
        
        
         set.remove(src);
        
        
    }   
    
    
    
    public static void main(String[] args) 
    { 
        // Create a sample graph 
    
      int[][] graph = {{1,2},{3},{3},{}};
    
     System.out.println(allPathsSourceTarget(graph));
    
    }
    
}