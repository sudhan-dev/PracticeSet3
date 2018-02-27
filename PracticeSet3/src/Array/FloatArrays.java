package Array;

import java.util.Arrays;

public class FloatArrays {
	public static void main(String[] args) {
		float[] f1 = new float[] { 459.432f, 348.43f, 5832.327f };
		float[] f2 = new float[] { 459.432f, 348.43f, 5832.327f };
		boolean Result = Arrays.equals(f1, f2);
		System.out.println("Two float arrays equal ? : " + Result);
	}

}
