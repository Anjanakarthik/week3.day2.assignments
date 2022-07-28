package week3.day1.assignments;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sample = {2,3,5,6,3,2,1,4,2,1,6};
		Map<Integer,Integer>numbercount = new TreeMap<>();
		for(int i=0;i<sample.length;i++) {
			if(numbercount.containsKey(sample[i])) {
				numbercount.put(sample[i],numbercount.get(sample[i])+1 );
			}else {
				numbercount.put(sample[i], 1);
			}
				
		}
		System.out.print(numbercount+ " ");

}
}