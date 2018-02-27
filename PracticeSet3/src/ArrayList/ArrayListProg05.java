
//Remove all elements from Java ArrayList 

package ArrayList;

import java.util.ArrayList;

public class ArrayListProg05 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("15");
		arrayList.add("26");
		arrayList.add("45");
		arrayList.add("14");
		arrayList.add("44");
		System.out.println("Size of ArrayList before removing elements : " + arrayList.size());

		arrayList.clear();
		System.out.println("Size of ArrayList after removing elements : " + arrayList.size());

	}
}
