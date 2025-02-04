package com.wipro.java.interface1;

public class Document implements Printable,Showable{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showing the document");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing the document");
	}
	public static void main(String[] args) {
		Document doc = new Document();
		doc.print();
		doc.show();
	}
	
}
