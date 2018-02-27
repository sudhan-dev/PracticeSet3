
//Add an element to specified index of Java ArrayList

package ArrayList;

import java.util.ArrayList;

public class ArrayListProg03 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		System.out.println("ArrayList contains...");
		System.out.println(arrayList);

		arrayList.add(1, "INSERTED ELEMENT");
		System.out.println("After Inserted element ArrayList contains...");
		System.out.println(arrayList);

	}
}
