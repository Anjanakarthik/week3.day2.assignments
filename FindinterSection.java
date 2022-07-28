package week3.day1.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindinterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstarray = {3,2,11,4,6,7};
		int [] secarray= {1,2,8,4,9,7};
		Set<Integer>unique = new LinkedHashSet<Integer>();
		for(int i =0;i<firstarray.length;i++) {
			unique.add(firstarray[i]);
			if(unique.contains(secarray[i])) {
				System.out.print(secarray[i]+" ");
			}
		}


	}

}
