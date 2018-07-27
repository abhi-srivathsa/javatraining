package com.del;

public class UserMainCode {

	public static boolean checktriplets(int[] arr) {
		int i,b=0;
		
		for(i=0;i<arr.length-2;i++) {
			if(arr[i]==arr[i+1] && arr[i]==arr[i+2])
			return true;
			else 
				continue;
		}
		return false;
	}


}