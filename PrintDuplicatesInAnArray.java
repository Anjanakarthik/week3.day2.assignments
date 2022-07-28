package week3.day1.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {14,12,13,15,11,14,18,16,17,19,18,17,20};
int count=0;
//14,17,18

Set<Integer>samplelist = new LinkedHashSet<Integer>();
for(int num:arr) {
	//samplelist.add(arr[i]);
	if(!samplelist.add(num)) {
		System.out.print(num+" ");
}

//System.out.print(samplelist);

	}
		
	}

	}	
	

	

