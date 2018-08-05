package com.del;

public class TestObject {
	int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TestObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestObject(int data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "TestObject [data=" + data + "]";
	}
	
	void printData() {
		System.out.println("Data : "+data);
	}
	
	void display(String val) {
		System.out.println(val);
	}
	
	int squareData() {
		return data*data;
	}

}
