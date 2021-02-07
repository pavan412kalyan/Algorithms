package MixProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class Compare implements Comparator<classforComapartor> {

	@Override
	public int compare(classforComapartor o1, classforComapartor o2) {
		// TODO Auto-generated method stub
		
		if(o1.marks==o2.marks)
		return o1.name.compareTo(o2.name);
		//-1 o1,o2  -- o1<o2
		//+1  o1,o2       o2>o1
		
		return o2.marks-o1.marks;
	}

	 
	
	
	
	
	
}

class classforComapartor
{
 String name;
 int marks;
 
 
 public classforComapartor(String name, int marks) {
	super();
	this.name = name;
	this.marks = marks;
}


public static void main(String args[])
 {
	 ArrayList<classforComapartor> al = new ArrayList<>();
	 
	 classforComapartor c1 = new classforComapartor("pavan",23);
	 classforComapartor c2 = new classforComapartor("kpavan",23);
	 classforComapartor c3 = new classforComapartor("ghpavan",33);
	 al.addAll(new ArrayList<classforComapartor>(Arrays.asList(c1,c2,c3)));
	 
	
	 for(classforComapartor c : al)
		 System.out.println(c.name);
	 
    Collections.sort(al,new Compare());

	 for(classforComapartor c : al)
		 System.out.println(c.name);
 }
 



}


