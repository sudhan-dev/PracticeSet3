
//Copy all elements of Java ArrayList to an Object Array 

package ArrayList;

import java.util.ArrayList;

public class ArrayListProg12 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		Object[] objArray = arrayList.toArray();
		System.out.println("ArrayList elements are copied into an Array.Now Array Contains..");

		for (int index = 0; index < objArray.length; index++)
			System.out.println(objArray[index]);
	}
}
