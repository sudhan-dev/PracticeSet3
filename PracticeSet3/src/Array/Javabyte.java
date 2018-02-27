package Array;

import java.util.Arrays;

public class Javabyte {
	public static void main(String[] args) {
		byte[] b1 = new byte[] { 1, 43, 45 };
		byte[] b2 = new byte[] { 7, 25, 12 };

		boolean Result = Arrays.equals(b1, b2);
		System.out.println("Are two byte arrays equal ? : " + Result);
	}
}
