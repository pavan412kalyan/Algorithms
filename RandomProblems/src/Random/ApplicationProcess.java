package Random;

import java.util.*;

public class ApplicationProcess {

	public static void main(String[] args) {
//		String[] foreground = new String[] {"2|7", "3|14"};
//		String[] background = new String[] {"2|10", "3|14"};
		
		String[] foreground = new String[] {"1|2", "2|4", "3|2"};
		String[] background = new String[] {"1|6", "2|3", "3|6"};
		
		
		int target = 8, index = 0;
		int[] foreArr = new int[foreground.length];
		int[] backArr = new int[background.length];

		HashMap<Integer, List<Integer>> foreMap = new HashMap<>();
		HashMap<Integer, List<Integer>> backMap = new HashMap<>();

		for(String temp: foreground) {
			String[] pair = temp.split("\\|");
			int key = Integer.parseInt(pair[1]);
			int values = Integer.parseInt(pair[0]);
			if(!foreMap.containsKey(key)) {
				foreMap.put(key, new ArrayList<>());
			}
			foreMap.get(key).add(values);
			foreArr[index++] = Integer.parseInt(pair[1]);
		}

		index = 0;

		for(String temp: background) {
			String[] pair = temp.split("\\|");
			int key = Integer.parseInt(pair[1]);
			int values = Integer.parseInt(pair[0]);
			if(!backMap.containsKey(key)) {
				backMap.put(key, new ArrayList<>());
			}
			backMap.get(key).add(values);
			backArr[index++] = Integer.parseInt(pair[1]);
		}

		Arrays.sort(foreArr);
		Arrays.sort(backArr);

		int foreStart = 0, backEnd = backArr.length - 1, curMax = -1;
		List<String> result = new ArrayList<>();

		while(foreStart < foreArr.length && backEnd >= 0) {
			int curr = foreArr[foreStart] + backArr[backEnd];
			if(curr <= target) {
				if(curr > curMax) {
					result = new ArrayList<>();
					curMax = curr;
					result.add(foreArr[foreStart] + "," + backArr[backEnd]);
				} else if(curr == curMax) {
					result.add(foreArr[foreStart] + "," + backArr[backEnd]);
				}
				foreStart++;
			} else {
				backEnd--;
			}
		}

		System.out.println(result);
		StringBuilder sb = new StringBuilder();	

		for(String res : result)
		{
			 
			System.out.println(res);
			
			String[] ids = res.split(",");
		
			int firstId = Integer.parseInt(ids[0]);
			int SecondId = Integer.parseInt(ids[1]);

			
			
			for(int foreId : foreMap.get(firstId))
			{
				for(int backId : backMap.get(SecondId))
				{
					
					//System.out.println();
					sb.append(foreId+"|"+backId+",");
										
				}
				
									
			}
			
		
		}
		
		
		sb.deleteCharAt(sb.length()-1);
		
		
		
		System.out.println(sb);
		
		
	}
}