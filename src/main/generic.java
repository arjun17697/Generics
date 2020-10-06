package main;

public class generic<T extends Comparable<T>> {
	private T[] inputArray;

	public generic(T[] inputArray) {
		this.inputArray = inputArray;
	}

	public void max() {
		generic.max(this.inputArray);

	}

	public static <T extends Comparable<T>> T max(T... inputArray) {
		T max = inputArray[0];
		for (int i = 0; i < 3; i++) {
			if (inputArray[(int) i].compareTo(max) > 0) {
				max = inputArray[i];
			}
		}
		return max;
		/*
		 * }
		 * 
		 * 
		 * public static <T extends Comparable<T>> T maxfloat_uc2(T[] floatArray) { T
		 * max=floatArray[0]; for (int i=0;i<3;i++) { if (floatArray[(int)
		 * i].compareTo(max)>0) { max= floatArray[i]; } } return max; }
		 * 
		 * public static <T extends Comparable<T>> T maxString_uc3(T[] stringArray) { T
		 * max=stringArray[0]; for (int i=0;i<3;i++) { if (stringArray[(int)
		 * i].compareTo(max)>0) { max= stringArray[i]; } } return max; }
		 */
	}
}
