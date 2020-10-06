package main;

public class generic {

	public static <T extends Comparable<T>> T maxint_uc1(T[] intArray) {
		T max=intArray[0];
		for (int i=0;i<3;i++) {
			if (intArray[(int) i].compareTo(max)>0) {
				max= intArray[i];
			}
		}
		return max;
	}
	

}
