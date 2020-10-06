package main;

import java.util.ArrayList;

public class generic {

	public static <T extends Comparable<T>> void testMaximum(T... args) {
		System.out.println("argument length :"+args.length);
		ArrayList<T> arr = new ArrayList<>();
		for (T t: args)
		{
			arr.add(t);
		}
	}
}
		
	
