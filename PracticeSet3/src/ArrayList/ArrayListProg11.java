
//Search an element of Java ArrayList 

package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProg11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("43");
		arrayList.add("45");
		arrayList.add("65");
		arrayList.add("46");
		arrayList.add("23");
		arrayList.add("24");
		arrayList.add("15");

		System.out.println("Element of the list are:");
		System.out.println(arrayList);

		System.out.println("Enter the element to be searched");

		String str = sc.next();

		if (arrayList.contains(str))
			System.out.println("Element found at location " + arrayList.indexOf(str));
		else
			System.out.println("Element Not found");

		sc.close();

	}

}
