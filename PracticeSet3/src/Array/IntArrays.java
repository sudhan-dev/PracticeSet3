package Array;

import java.util.Arrays;

public class IntArrays {
	public static void main(String[] args) {
		int[] intArray1 = new int[] { 12, 13, 14 };
		int[] intArray2 = new int[] { 12, 13, 14, 15 };

		boolean blnResult = Arrays.equals(intArray1, intArray2);
		System.out.println("Are two int arrays equal ? : " + blnResult);
	}
}
