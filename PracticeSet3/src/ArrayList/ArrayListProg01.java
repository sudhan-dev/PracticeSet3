
//Array List Example

package ArrayList;

import java.util.ArrayList;

public class ArrayListProg01 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("15");
		arrayList.add("26");
		arrayList.add("45");
		arrayList.add("14");
		arrayList.add("44");

		System.out.println("Getting elements of ArrayList");

		System.out.println(arrayList);

		System.out.println("Getting Elements of ArrayList using indexing");

		System.out.println("Element of index 2: " + arrayList.get(2));
		System.out.println("Element of index 4: " + arrayList.get(4));
	}
}
