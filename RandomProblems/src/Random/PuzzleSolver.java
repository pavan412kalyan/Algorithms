package Random;

import java.util.*;
public class PuzzleSolver {

static int rows;
static int cols;
static Set<String> visited = new HashSet<>();
static int[] dirs ;
static String target ="";


static void problem(List<List<Integer>>  matrix)
{
Queue<String> queue = new LinkedList<>();

rows = matrix.size();
cols = matrix.get(0).size();
StringBuilder cur = new StringBuilder("");


dirs = new int[]{-1,1,cols,-cols};

for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
cur.append(matrix.get(i).get(j));

}

}

for(int i=0;i<rows*cols;i++)
{
target = target + ""+i;

}
//target+="0";
System.out.println(target);

System.out.println(cur);
queue.offer(cur.toString());
visited.add(cur.toString());

int ans  = bfs(queue);


      System.out.println(ans);

}


private static int bfs(Queue<String> queue) {
// TODO Auto-generated method stub

int count=0;


while(!queue.isEmpty())
{
int size = queue.size();

for(int i=0;i<size;i++)
{
String poll = queue.poll();
System.out.println(poll);
if(poll.equals(target))
{

return count;

}

int indexOfZero = poll.indexOf("0");
// System.out.println(indexOfZero);
     
for(int d : dirs)
{

      int indexOfNeig = indexOfZero + d;

if(checkbounds(indexOfZero,d,indexOfNeig))
    continue;


//   if( indexOfNeig < 0 || indexOfNeig > 8 || (d==-1 &&  indexOfZero == 6)
// || (d==-1 &&  indexOfZero == 3) || (d==1 &&  indexOfZero == 2)
// || (d==1 && indexOfZero==5 ))
//           continue;
//

String newStr = swap(poll,indexOfNeig,indexOfZero);
   
 if(!visited.contains(newStr))
 {
 visited.add(newStr);
 queue.offer(newStr);  
 }


}

}

count++;


   }


return -1;



}





private static boolean checkbounds(int indexOfZero, int d,int indexOfNeig) {
// TODO Auto-generated method stub

if( indexOfNeig < 0 || indexOfNeig > rows*cols -1)
 return true;

if(indexOfZero%cols==0 && d==-1)
     return true;

if(indexOfZero%cols==cols-1 && d==1)
     return true;



return false;
}


private static String swap(String poll, int indexOfNeig, int indexOfZero) {
// TODO Auto-generated method stub
       
//System.out.println(indexOfNeig+"="+indexOfZero);
StringBuilder s = new StringBuilder(poll);
s.setCharAt(indexOfNeig,poll.charAt(indexOfZero));
s.setCharAt(indexOfZero,poll.charAt(indexOfNeig));

//System.out.println(s.toString());
       return s.toString();

}


public static void main(String[] args) {


 List<List<Integer>> matrix = new ArrayList<>();
 
//  matrix.add(Arrays.asList(0,1,3));
//  matrix.add(Arrays.asList(4,2,5));
//  matrix.add(Arrays.asList(7,8,6));
 
 
 matrix.add(Arrays.asList(1,0,2));
 matrix.add(Arrays.asList(3,4,5));
 matrix.add(Arrays.asList(6,7,8));


System.out.println(matrix);
 problem(matrix);


}

}
