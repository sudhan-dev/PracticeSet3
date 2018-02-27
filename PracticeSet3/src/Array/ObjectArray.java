
//Create List from Java Object Array 

package Array;

import java.util.Arrays;
import java.util.List;

public class ObjectArray {
	public static void main(String[] args) {
		String[] strArray = new String[] { "Object", "Array", "Converted", "To", "List" };
		List<String> list = Arrays.asList(strArray);

		System.out.println("List created from an Array of type Object contains,");

		System.out.println(list);
	}
}
