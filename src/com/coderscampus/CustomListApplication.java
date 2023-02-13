package com.coderscampus;

public class CustomListApplication {

	public static void main(String[] args) {
		
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		//Test Code 1:
//		System.out.println("Custom Array List adding 10 Items");
//		addItems(myCustomList,10);
//		myCustomList.add("element11");
//		myCustomList.add("element12");
//		myCustomList.add("element13");
//		myCustomList.add("element14");


//		//Test Code 2:
//		System.out.println("Custom Array List adding 20 Items");
//		addItems(myCustomList,20);
//		myCustomList.add("element21");
//		myCustomList.add("element22");
//    	myCustomList.add("element23");
//		myCustomList.add("element24");
		
		//Test Code 3:
		System.out.println("Custom Array List adding 40 Items");
		addItems(myCustomList,1000);
		System.out.println(myCustomList.getSize());
		System.out.println(myCustomList.get(100));
//		
//		for (int i=0; i<myCustomList.getSize(); i++) {
//		    System.out.println(myCustomList.get(i));
//		}
	}
	public static void addItems(CustomList<String> myCustomList, int size) {
		for(int i =0; i<size;i++)
		myCustomList.add("element" + (i+1));
	}
	

}
