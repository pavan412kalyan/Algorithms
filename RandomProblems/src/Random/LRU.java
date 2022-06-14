package Random;

import java.util.*;
//leet code 
class LRUCache {

    HashMap<Integer,Integer> map;
    Queue<Integer> queue;
    int max;
    public LRUCache(int capacity) {
        
        map = new HashMap();
        queue = new LinkedList();
         max = capacity;
        
        
    }
    
    public int get(int key) {
      
        if(map.containsKey(key))
       {   queue.remove(key);
            queue.offer(key);
            
            return map.get(key);
       }
        else 
            return -1;
        
    }
    
    public void put(int key, int value) {
      

 
        if(map.containsKey(key))
        {
            map.put(key,value); //update
            queue.remove(key);
            queue.offer(key);
            
        }
        
        else {
            
            if(queue.size()==max)
            {

               int poll= queue.poll();
                map.remove(poll);
                map.put(key,value);
                queue.offer(key);
                
            }
            else{
                
              map.put(key,value);
              queue.offer(key);  
                
            }
            
            
        }
        
    
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */