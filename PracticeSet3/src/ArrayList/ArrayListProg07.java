
//Replace an element at specified index of Java ArrayList 

package ArrayList;

import java.util.ArrayList;

public class ArrayListProg07 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		System.out.println("ArrayList contains...");
		System.out.println(arrayList);

		arrayList.set(1, "REPLACED ELEMENT");

		System.out.println("After Replacement ArrayList contains...");
		System.out.println(arrayList);

	}
}
