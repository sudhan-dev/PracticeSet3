package Array;

import java.util.Arrays;

public class DoubleArrays {
	public static void main(String[] args) {
		double[] d1 = new double[] { 12.3221, 589.23, 627.213 };
		double[] d2 = new double[] { 12.3221, 589.23, 627.213 };
		boolean Result = Arrays.equals(d1, d2);
		System.out.println("Two double arrays equal ? : " + Result);
	}

}
