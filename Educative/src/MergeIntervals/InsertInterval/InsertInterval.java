package MergeIntervals.InsertInterval;
import java.util.*;
/*Given a list of non-overlapping intervals sorted by their start time, 
 * insert a given interval at the correct position and merge all necessary
 *  intervals to produce a list that has only mutually exclusive intervals.

Example 1:

Input: Intervals=[[1,3], [5,7], [8,12]], New Interval=[4,6]
Output: [[1,3], [4,7], [8,12]]
Explanation: After insertion, since [4,6] overlaps with [5,7], we merged them into one [4,7].*/
class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

@Override
public String toString() {
	return "Interval [start=" + start + ", end=" + end + "]";
}
};

class InsertInterval {

  public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> mergedIntervals = new ArrayList<>();
    //TODO: Write your code here
    int i=0;
   int n=intervals.size();
    while(i<n && newInterval.start >intervals.get(i).end ) 	
    {
    	 mergedIntervals.add(intervals.get(i));
    	 // System.out.println(mergedIntervals.toString());
    	i++;
    }
  //  while(i<n && ( newInterval.start <= intervals.get(i).end)) 	
    while (i < intervals.size() && intervals.get(i).start <= newInterval.end){
    	newInterval.start = Math.max(newInterval.start,intervals.get(i).start);
    	newInterval.end = Math.max(newInterval.end,intervals.get(i).end);
			
    	i++;
    }
    mergedIntervals.add(newInterval);
    
    while(i<n ) 	
    {
  	//  System.out.println(mergedIntervals.toString());

    	  mergedIntervals.add(intervals.get(i));
    	i++;
    }
    
    
    
    
     	
     	
   
        
    
    
    return mergedIntervals;
  }

  public static void main(String[] args) {
      List<Interval> input = new ArrayList<Interval>();
    input.add(new Interval(1, 3));
    input.add(new Interval(5, 7));
    input.add(new Interval(8, 12));
    System.out.print("Intervals after inserting the new interval: ");
    for (Interval interval : InsertInterval.insert(input, new Interval(4, 6)))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(1, 3));
    input.add(new Interval(5, 7));
    input.add(new Interval(8, 12));
    System.out.print("Intervals after inserting the new interval: ");
    for (Interval interval : InsertInterval.insert(input, new Interval(4, 10)))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(2, 3));
    input.add(new Interval(5, 7));
    System.out.print("Intervals after inserting the new interval: ");
    for (Interval interval : InsertInterval.insert(input, new Interval(1, 4)))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();
  }
}