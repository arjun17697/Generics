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
	

	public static <T extends Comparable<T>> T maxfloat_uc2(T[] floatArray) {
		T max=floatArray[0];
		for (int i=0;i<3;i++) {
			if (floatArray[(int) i].compareTo(max)>0) {
				max= floatArray[i];
			}
		}
		return max;
	}
	
	public static <T extends Comparable<T>> T maxString_uc3(T[] stringArray) {
		T max=stringArray[0];
		for (int i=0;i<3;i++) {
			if (stringArray[(int) i].compareTo(max)>0) {
				max= stringArray[i];
			}
		}
		return max;
	}

}

