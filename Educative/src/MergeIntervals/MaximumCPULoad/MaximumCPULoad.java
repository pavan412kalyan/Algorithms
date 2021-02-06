package MergeIntervals.MaximumCPULoad;

import java.util.*;


class Job {
  int start;
  int end;
  int cpuLoad;

  public Job(int start, int end, int cpuLoad) {
    this.start = start;
    this.end = end;
    this.cpuLoad = cpuLoad;
  }
};

class MaximumCPULoad {

  public static int findMaxCPULoad(List<Job> jobs) {
    // TODO: Write your code here
	  
	  Collections.sort(jobs,(a,b)->a.start-b.start);
	  PriorityQueue<Job> pq = new PriorityQueue<Job>((a,b)->a.end-b.end);

	  
	  int load =0,maxLoad=-1;
	  for(Job job : jobs)
	  {
		  
		  while(!pq.isEmpty() && job.start >= pq.peek().end)
		  {
			  Job j = pq.poll();
			  load-=j.cpuLoad;
			  
		  }
		  
		  
		  pq.offer(job);
		  load+=job.cpuLoad;
		  maxLoad= Math.max(maxLoad,load);
		  
	  }
	  
	  
	 
	  
	  
    return maxLoad;
  }

  public static void main(String[] args) {
    List<Job> input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 3), new Job(2, 5, 4), new Job(7, 9, 6)));
    System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));

    input = new ArrayList<Job>(Arrays.asList(new Job(6, 7, 10), new Job(2, 4, 11), new Job(8, 12, 15)));
    System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));

    input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 2), new Job(2, 4, 1), new Job(3, 6, 5)));
    System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));
  }
}