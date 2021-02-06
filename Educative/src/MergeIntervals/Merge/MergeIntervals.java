package MergeIntervals.Merge;
/*Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually exclusive intervals.

Example 1:

Intervals: [[1,4], [2,5], [7,9]]
Output: [[1,5], [7,9]]
Explanation: Since the first two intervals [1,4] and [2,5] overlap, we merged them into 
one [1,5].*/
import java.util.*;

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

class MergeIntervals {

  public static List<Interval> merge(List<Interval> intervals) {
    List<Interval> mergedIntervals = new LinkedList<Interval>();
    // TODO: Write your code here
    
    
   // Collections.sort(intervals,(a,b)->a.start-b.start);
    
   PriorityQueue<Interval> pq = new PriorityQueue<Interval>((a,b)->a.start-b.start);
   for(Interval i : intervals)pq.offer(i);
   
   // System.out.println(pq);
    while(!pq.isEmpty())
    {
    	Interval interval1 = pq.poll();
    	
    	if(!pq.isEmpty())
    	{
    		
        	Interval interval2 = pq.poll();
        	
        	if(interval1.end>=interval2.start)
        	{
        		pq.offer(new Interval(interval1.start,Math.max(interval1.end, interval2.end)));
        		
        	}
        	
        	else {
        		  pq.offer(interval2);// put back the second
                 mergedIntervals.add(interval1);
        		
        	}
    		
    	}
    	
    	else {
        	System.out.println(interval1.start+"--"+interval1.end);

            mergedIntervals.add(interval1);

    		
    	}
    
    	
    	
    	
    } 
       
    
    
    return mergedIntervals;
  }

  public static void main(String[] args) {
    List<Interval> input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 5));
    input.add(new Interval(7, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();
    System.out.println("=================");

    input = new ArrayList<Interval>();
    input.add(new Interval(6, 7));
    input.add(new Interval(2, 4));
    input.add(new Interval(5, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 6));
    input.add(new Interval(3, 5));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();
  }
}