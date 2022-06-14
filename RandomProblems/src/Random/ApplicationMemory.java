package Random;

import java.util.*;

public class ApplicationMemory {

	
	public static void main(String[] args) {

//		String[] fore = new String[] {"1|2", "2|4", "3|2"};
//		String[] back = new String[] {"1|6", "2|3", "3|6"};
//		
//	String[] fore = new String[] {"2|7", "3|14"};
//		String[] back = new String[] {"2|10", "3|14"};


	String[] fore = new String[] {"1|1", "2|1", "3|1"};
	String[] back = new String[] {"1|1", "2|1", "3|1"};
		
		
		int targetMem =1;
		
		
		int[] foreMemo = new int[fore.length];
		int[] backMemo = new int[back.length];
		
		HashMap<Integer,List<Integer>> foreIds = new HashMap<>();
		HashMap<Integer,List<Integer>> backIds = new HashMap<>();

		int i=0;
		for(String temp : fore)
		{
			String[] res = temp.split("\\|");
			//System.out.println(res[0]);
			int Mapid  = Integer.parseInt(res[1]);
			int Mapval = Integer.parseInt(res[0]);
			
			List<Integer> list = foreIds.getOrDefault(Mapid, new ArrayList<Integer>());
			list.add(Mapval);
			
			foreIds.put(Mapid,list);
			foreMemo[i++]=Mapid;
			
		}
		System.out.println(foreIds);
		
		i=0;
		for(String temp : back)
		{
			String[] res = temp.split("\\|");
			int Mapid  = Integer.parseInt(res[1]);
			int Mapval = Integer.parseInt(res[0]);
			
			List<Integer> list  = backIds.getOrDefault(Mapid, new ArrayList<Integer>());
			list.add(Mapval);
			backIds.put(Mapid,list);
			backMemo[i++]=Mapid;

		}
		
		Arrays.sort(foreMemo);
		Arrays.sort(backMemo);
		
		System.out.println(backIds);
		
		
		
		int left = 0, right = foreMemo.length - 1, curMax = -1;
		Set<String> result = new HashSet<>();
		
		while(left < foreMemo.length && right >= 0) {
			int curr = foreMemo[left] + backMemo[right];
			if(curr <= targetMem) {
				System.out.println(curr);

				if(curr > curMax) {
					result = new HashSet<>();
					curMax = curr;
					result.add(foreMemo[left] + "," + backMemo[right]);
				} else if(curr == curMax) {
					result.add(foreMemo[left] + "," + backMemo[right]);
				}
				left++;
			} else {
				right--;
			}
			
		//	System.out.println("----");
			//System.out.println(result);
		}
		
		

		
		
		
		System.out.println(result);
		
		
		
		

		List<String> ans = new ArrayList<>();
		
		for(String res : result)
		{
			 
			System.out.println(res);
			
			String[] ids = res.split(",");
		
			int firstId = Integer.parseInt(ids[0]);
			int SecondId = Integer.parseInt(ids[1]);

			
			// if(firstId + )
			
			
			for(int foreId : foreIds.get(firstId))
			{
				for(int backId : backIds.get(SecondId))
				{
					
					//System.out.println();
					//sb.append(foreId+"|"+backId+",");
					ans.add(foreId+"|"+backId);
										
				}
				
									
			}
			
		
		}
		
		Collections.sort(ans);
		System.out.println(ans);
		
		
		
		StringBuilder sb = new StringBuilder();	

		for(String str : ans)
		{
			sb.append(str+",");
		}
		
		if(sb.length()>0 && sb!=null)
		sb.deleteCharAt(sb.length()-1);

		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}	
	
}
