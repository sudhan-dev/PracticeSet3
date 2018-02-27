package Array;

import java.util.Arrays;

public class LongArrays {
	public static void main(String[] args) {
		long[] l1 = new long[] { 313873, 97210, 420918 };
		long[] l2 = new long[] { 313873, 97210, 420918 };
		boolean Result = Arrays.equals(l1, l2);
		System.out.println("Two long arrays equal ? : " + Result);
	}
}
