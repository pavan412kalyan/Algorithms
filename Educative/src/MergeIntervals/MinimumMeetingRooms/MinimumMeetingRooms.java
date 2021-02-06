package MergeIntervals.MinimumMeetingRooms;
/*Minimum Meeting Rooms (hard) #

Example 1:

Meetings: [[1,4], [2,5], [7,9]]
Output: 2
Explanation: Since [1,4] and [2,5] overlap, we need two rooms to hold these two meetings. [7,9] can 
occur in any of the two rooms later.*/
import java.util.*;

class Meeting {
  int start;
  int end;

  public Meeting(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

class MinimumMeetingRooms {

  public static int findMinimumMeetingRooms(List<Meeting> meetings) {
    // TODO: Write your code here    
	  
	  //pq are rooms, check  if the earliest ending meeting is complted by the next meeting or not
	  Collections.sort(meetings,(a,b)->a.start-b.start);
	  
	  PriorityQueue<Meeting> pq = new PriorityQueue<Meeting>((a,b)->a.end-b.end);
	  int rooms =-1;
	  for(Meeting meet  : meetings )
	  {
		
		  
		  while(pq.size()!=0 && pq.peek().end <= meet.start)
		  {
			  pq.poll();
		  }
		  pq.offer(meet);
		  
		  
		  rooms = Math.max(rooms, pq.size());
		  
	  }
	  
	  
	  
	  
	  
	  
	  

    return rooms;
  }

  public static void main(String[] args) {
    List<Meeting> input = new ArrayList<Meeting>() {
      {
        add(new Meeting(4, 5));
        add(new Meeting(2, 3));
        add(new Meeting(2, 4));
        add(new Meeting(3, 5));
      }
    };
    int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);

    input = new ArrayList<Meeting>() {
      {
        add(new Meeting(1, 4));
        add(new Meeting(2, 5));
        add(new Meeting(7, 9));
      }
    };
    result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);

    input = new ArrayList<Meeting>() {
      {
        add(new Meeting(6, 7));
        add(new Meeting(2, 4));
        add(new Meeting(8, 12));
      }
    };
    result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);

    input = new ArrayList<Meeting>() {
      {
        add(new Meeting(1, 4));
        add(new Meeting(2, 3));
        add(new Meeting(3, 6));
      }
    };
    result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);

    input = new ArrayList<Meeting>() {
      {
        add(new Meeting(4, 5));
        add(new Meeting(2, 3));
        add(new Meeting(2, 4));
        add(new Meeting(3, 5));
      }
    };
    result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
    System.out.println("Minimum meeting rooms required: " + result);
  }
}