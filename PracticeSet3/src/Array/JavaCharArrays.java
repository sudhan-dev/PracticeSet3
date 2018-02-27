package Array;

import java.util.Arrays;

public class JavaCharArrays {
	public static void main(String[] args) {

		char[] charArray1 = new char[] { 'a', 'b', 'c', 'd', 'e' };
		char[] charArray2 = new char[] { 'a', 'b', 'c', 'd', 'f' };

		boolean Result = Arrays.equals(charArray1, charArray2);
		System.out.println("Two char arrays equal ? : " + Result);

	}

}
