
// Remove element of a list using index

package ArrayList;

import java.util.ArrayList;

public class ArrayListProg04 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("2");
		arrayList.add("26");
		arrayList.add("43");

		System.out.println("Arraylist contaings");
		System.out.println(arrayList);

		Object obj = arrayList.remove(2);
		System.out.println(obj + " is removed from ArrayList");
		System.out.println("After removal ArrayList contains...");

		System.out.println(arrayList);

	}

}
