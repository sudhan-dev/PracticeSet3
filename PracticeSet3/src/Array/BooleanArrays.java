package Array;

import java.util.Arrays;

public class BooleanArrays {
	public static void main(String[] args) {
		boolean[] blnArray1 = new boolean[] { true, false, true };
		boolean[] blnArray2 = new boolean[] { true, false, true };
		boolean Result = Arrays.equals(blnArray1, blnArray2);
		System.out.println("Two boolean arrays equal ? : " + Result);
	}
}
