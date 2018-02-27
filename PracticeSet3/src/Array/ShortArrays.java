package Array;

import java.util.Arrays;

public class ShortArrays {
	public static void main(String[] args) {
		short[] s1 = new short[] { 100, 87, 90 };
		short[] s2 = new short[] { 100, 87, 90 };
		boolean Result = Arrays.equals(s1, s2);
		System.out.println("Two short arrays equal ? : " + Result);
	}
}
