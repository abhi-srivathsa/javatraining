package com.del;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMain {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("methods.csv"));
			String line = "";
			int i= 0;
			String[] csvArray = null;
			// no paramater
			Class noparams[] = {};
			// String parameter
			Class[] paramString = new Class[1];
			paramString[0] = String.class;
			// int parameter
			Class[] paramInt = new Class[1];
			paramInt[0] = Integer.TYPE;
			Class cls = Class.forName("com.del.TestObject");
			Object obj = cls.newInstance();
						
			while ((line = reader.readLine()) != null) {
				csvArray = line.trim().split(",");		
				if(csvArray[1].equalsIgnoreCase("true")) {
					switch (csvArray[0]) {
						case "setData":
							Method method = cls.getDeclaredMethod("setData", paramInt);
							int number = Integer.parseInt(csvArray[4]);
							method.invoke(obj, number);
							System.out.println("Data set");
				
							break;
						case "printData":
							method = cls.getDeclaredMethod("printData", noparams);
							method.invoke(obj, null);
				
							break;
						case "display":
							method = cls.getDeclaredMethod("display", paramString);
							method.invoke(obj, csvArray[4]);
				
							break;
						case "squareData":
							method = cls.getDeclaredMethod("squareData", noparams);
							Object val = method.invoke(obj, null);
							int square = (int)val;
							System.out.println("The square of the data is "+square);
				
							break;
						default:System.out.println("Invalid Method");
							break;
					}
			
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
