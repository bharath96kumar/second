package org.tcs.test.login;

public class Overriding {
	public void comId(int id) {
		System.out.println("company id is " +id);

	}
	public void comgth(float gth,String ly) {
		System.out.println("company growth is " +gth +"\t"+"last year growth is " +ly );

	}

	public static void main(String[] args) {
		Overriding o=new Overriding();
		o.comId(800);
		o.comgth(2.5f, "abcd");

	}

}
