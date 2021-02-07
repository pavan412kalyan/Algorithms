package Graphs2;
/*There are N network nodes, labelled 1 to N.

Given times, a list of travel times as directed edges times[i] = (u, v, w), where u is the source node, 
v is the target node, and w is the time it takes for a signal to travel from source to target.

Now, we send a signal from a certain node K. How long will it take for all nodes to receive the signal? If it is impossible, return -1.
Input: times = [[2,1,1],[2,3,1],[3,4,1]], N = 4, K = 2
Output: 2
*/
import java.util.*;

public class Dijkstras {

public static int networkDelayTime(int[][] times, int N, int K) {
        
        
        HashMap<Integer,List<int[]>> edges = new HashMap();
        
        for(int[] e : times)
        {
            if(!edges.containsKey(e[0]))
            {
                List<int[]> l = new ArrayList();
                l.add(new int[]{e[1],e[2]});
                edges.put(e[0],l);
                
                
            }
            else
            {
                List<int[]> l = edges.get(e[0]);
                l.add(new int[]{e[1],e[2]});
                edges.put(e[0],l);
                
            }
            
            
            
        }
        
      //  System.out.println(edges.toString());
    
       
        Set<Integer> visited = new HashSet();
        int src =K;
        //visited.add(src);
        
        int[] dis = new int[N+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;
        
     PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[1]-b[1]);   
     int d=0; 
     queue.add(new int[]{src,0});   
        
        int ans =Integer.MIN_VALUE;
        while(!queue.isEmpty())
        {
            int[] parent = queue.poll();
             src = parent[0];
             d=parent[1];
            if(visited.contains(src))
                  continue;
            visited.add(src);
           
            if(edges.containsKey(src))
            for(int[] children : edges.get(src))
            {
               int child=children[0];
              
                dis[child] = Math.min(dis[child],d+children[1]);
               //  System.out.println( dis[child]);
                queue.add(new int[]{child,dis[child]});
                
              
                
            }
            
            
            
        }
        
        
        for(int i=1;i<N+1;i++)
         ans=Math.max(ans,dis[i]);
        
       //System.out.println(Arrays.toString(dis));
        
      return ans==Integer.MAX_VALUE?-1:ans;  
        
        
        
        
    }
   public static void main(String[] args) {
    
	 System.out.println(  networkDelayTime(new int[][] {{2,1,1},{2,3,1},{3,4,1}},4,2)  );
	
  }
}
	
	

