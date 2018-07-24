package com.del;

import java.util.Random;

public class RandomSentenceGeneration {
	public static void main(String[] args) {
		String[] article = { "the", "a", "one", "some","all" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };
		String stmt;
		int num[] = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = new Random().nextInt(5);
		}
		String str = article[num[0]];
		String first = str.substring(0, 1).toUpperCase() + str.substring(1);
		String total = first +" "+ noun[num[1]]+" "+ verb[num[2]]+" "+ preposition[num[3]]+" "+ article[num[4]]+" "+ noun[num[5]]+".";
		System.out.println(total);
	}
}
