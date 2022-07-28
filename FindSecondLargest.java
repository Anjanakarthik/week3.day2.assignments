package week3.day1.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sample = {3,2,11,4,6,7};
		List<Integer>samplelist = new ArrayList<Integer>();
		for(int i =0;i <sample.length;i++) {
			samplelist.add(sample[i]);

		}
		Collections.sort(samplelist);
		int secondlargestnumber = samplelist.get(samplelist.size()-2);
		System.out.print(secondlargestnumber);

	}

}
