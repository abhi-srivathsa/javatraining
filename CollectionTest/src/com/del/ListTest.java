package com.del;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> colorList = new ArrayList<>();
		String[] colorarray = { "orange", "red", "blue", "green", "pink", "cyan" }; // after this statement we can add
																					// or remove any element
		for (String color : colorarray) {
			colorList.add(color);

		}
		System.out.println(colorList);
		System.out.println(colorList.get(3));
		colorList.remove(3);
		System.out.println(colorList);
		System.out.println(colorList.get(3));
		colorList.add(3,"yellow");
		System.out.println(colorList);
		System.out.println(colorList.get(3));
		String[] removeArr = {"orange","pink"};
		List<String> removeList = Arrays.asList(removeArr);
		Iterator<String> iter = colorList.iterator();
	while (iter.hasNext()) {
		String color = iter.next();
		if(removeList.contains(color)) {
			iter.remove();
		}
	}System.out.println(colorList);
	Collections.sort(colorList,Collections.reverseOrder());
	System.out.println(colorList);
 	}

}
