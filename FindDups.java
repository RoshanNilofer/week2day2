package week2.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		int[] values = {2, 5, 7, 7, 5, 9, 2, 3};
		int len = values.length;
		System.out.println(len);
		Arrays.sort(values);
		for(int i=0; i<len-1; i++) {
			if(values[i]==values[i+1])
			{
				System.out.println(values[i]);
			}
			}
	}
}