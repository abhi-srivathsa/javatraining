package com.del;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> itemMap = new ConcurrentHashMap<>();
		itemMap.put("mobile", "Samsung");
		itemMap.put("laptop", "Lenovo");
		itemMap.put("Deodrant", "Niviea");
		itemMap.put("mobile", "Apple");
		System.out.println(itemMap);
		Set<String> keySet = itemMap.keySet();
		Iterator<String> iter = keySet.iterator();
		int ctr = 0;
		while (iter.hasNext()) {
			ctr++;
			String item = (String) iter.next();
			System.out.println(item + " : " + itemMap.get(item));
			if (ctr == 3)
				itemMap.put("shirt", "Van Huesen");
		}
		System.out.println(itemMap);

	}
}
