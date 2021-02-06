package MergeIntervals.EmployeeFreeTime;
import java.util.*;


class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

class EmployeeFreeTime {

  public static List<Interval> findEmployeeFreeTime(List<List<Interval>> schedule) {
    List<Interval> result = new ArrayList<>();
    // TODO: Write your code here
    
    
    PriorityQueue<Interval> pq = new PriorityQueue<Interval>((a,b)->a.start-b.start);
      
    for(List<Interval> intervals : schedule)
    	for(Interval i : intervals)
    	    pq.offer(i);
    
    // System.out.println(pq);
    
    List<Interval> mergedIntervals = new ArrayList<Interval>();
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
         	//System.out.println(interval1.start+"--"+interval1.end);

             mergedIntervals.add(interval1);

     		
     	}
     
     	
     	
     	
     } 
        
    
    
  
     for( int i=0;i<mergedIntervals.size()-1;i++)
     {
    	 result.add(new Interval(mergedIntervals.get(i).end,mergedIntervals.get(i+1).start));
    	 
    	 
     }
    
  
    
    return result;
  }

  public static void main(String[] args) {

    List<List<Interval>> input = new ArrayList<>();
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3), new Interval(5, 6))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 3), new Interval(6, 8))));
    List<Interval> result = EmployeeFreeTime.findEmployeeFreeTime(input);
    System.out.print("Free intervals: ");
    for (Interval interval : result)
      System.out.print("[" + interval.start + ", " + interval.end + "] ");
    System.out.println();

    input = new ArrayList<>();
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3), new Interval(9, 12))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 4))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(6, 8))));
    result = EmployeeFreeTime.findEmployeeFreeTime(input);
    System.out.print("Free intervals: ");
    for (Interval interval : result)
      System.out.print("[" + interval.start + ", " + interval.end + "] ");
    System.out.println();

    input = new ArrayList<>();
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 4))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(3, 5), new Interval(7, 9))));
    result = EmployeeFreeTime.findEmployeeFreeTime(input);
    System.out.print("Free intervals: ");
    for (Interval interval : result)
      System.out.print("[" + interval.start + ", " + interval.end + "] ");
  }
}