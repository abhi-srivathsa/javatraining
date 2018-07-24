package com.del;

import java.awt.image.ColorConvertOp;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set<String> colorSet = new HashSet<>();
		String[] colorArr = { "orange", "red", "blue", "green", "pink", "cyan", "red" };
		for (String color : colorArr) {
			System.out.println(colorSet.add(color));
		}
		System.out.println(colorSet);
		Set<String> colorSorted = new TreeSet<>(colorSet);
		System.out.println(colorSorted);
		colorSorted.add("purple");
		System.out.println(colorSorted);
	}

}
