package week3.day1.assignments;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "we learn java basics as part of java sessions in java week1";
		String[] splittext = text.split(" ");

		char[] testarray = text.toCharArray();
		Set<String> unique = new LinkedHashSet<String>();
		for(int i =0;i<splittext.length;i++) {
			unique.add(splittext[i]);
		}

		String output=unique.toString().replace(",", " ");
		System.out.print(output);
	}

}
