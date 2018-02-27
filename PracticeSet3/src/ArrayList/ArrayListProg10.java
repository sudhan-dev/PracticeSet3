
//Append all elements of other Collection to Java ArrayList

package ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListProg10 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		System.out.println("ArrayList contains: ");
		System.out.println(arrayList);

		Vector<String> v = new Vector<String>();
		v.add("4");
		v.add("5");

		System.out.println("Vector elements are: ");
		System.out.println(v);

		arrayList.addAll(v);

		System.out.println("After appending all elements of Vector,ArrayList contains..");
		System.out.println(arrayList);
	}
}
