
//Insert all elements of other Collection to Specified Index of Java ArrayList 

package ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListProg06 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		System.out.println("Array Elements");

		System.out.println(arrayList);

		Vector<String> v = new Vector<String>();
		v.add("4");
		v.add("5");
		arrayList.addAll(1, v);

		System.out.println("After inserting all elements of Vector at index 1,\nArrayList contains..");
		System.out.println(arrayList);

	}

}
