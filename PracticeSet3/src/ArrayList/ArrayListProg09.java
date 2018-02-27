
//Sort elements of Java ArrayList 

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProg09 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("12");
		arrayList.add("73");
		arrayList.add("45");
		arrayList.add("54");
		arrayList.add("13");

		System.out.println("Array list before sorting: ");
		System.out.println(arrayList);

		Collections.sort(arrayList);

		System.out.println("ArrayList elements after sorting in ascending order : ");
		System.out.println(arrayList);

	}
}
