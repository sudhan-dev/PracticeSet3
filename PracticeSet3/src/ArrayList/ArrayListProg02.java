
// Iterator example

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg02 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("15");
		arrayList.add("16");
		arrayList.add("17");
		arrayList.add("18");
		arrayList.add("19");

		Iterator<String> itr = arrayList.iterator();

		System.out.println("Iterating through ArrayList elements");
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
