package com.ajia.fuxi;

public class Test4 {

	public static void main(String[] args) {
		Person1 per= new Person1();
		per.name="Ò¶×ÏŞ±";
		per.age=12;
		Person1 per1= new Person1();
		per1=per;
		per1.name="ÕÅÈı";
		System.out.println(per.info());
		System.out.println(per1.info());
		
	}

}
