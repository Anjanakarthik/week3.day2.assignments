package week3.day1.assignments;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FinfTheMostDupliatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sample = {2,3,5,6,3,2,1,4,2,1,6,6,6};
		Map<Integer,Integer>numbercount = new TreeMap<>();
		for(int i=0;i<sample.length;i++) {
			numbercount.put(sample[i], numbercount.getOrDefault(sample[i], 0)+1);
		}

		int	maxoccurance=0; //value
		int maxoccnumber=0; //key
		for(Entry<Integer, Integer> entry:numbercount.entrySet()) {

			if(entry.getValue()>maxoccurance) {
				maxoccurance=entry.getValue();
				maxoccnumber=entry.getKey();
			}

		}

		System.out.print(maxoccnumber);
	}

}


