
//Get Size of Java ArrayList and loop through elements  

package ArrayList;

import java.util.ArrayList;

public class ArrayListProg08 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		int totalElements = arrayList.size();

		System.out.println("ArrayList contains...");

		for (int index = 0; index < totalElements; index++)
			System.out.println(arrayList.get(index));

	}

}
