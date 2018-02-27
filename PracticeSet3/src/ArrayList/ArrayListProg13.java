
//Get Sub List of Java ArrayList 

package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProg13 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("15");
		arrayList.add("26");
		arrayList.add("45");
		arrayList.add("14");
		arrayList.add("44");
		List<String> lst = arrayList.subList(1, 3);

		System.out.println("Sub list contains : ");

		System.out.println(lst);

		Object obj = lst.remove(0);
		System.out.println(obj + " is removed from sub list");

		System.out.println("After removing " + obj + " from sub list, original ArrayList contains : ");
		System.out.println(arrayList);

	}

}
