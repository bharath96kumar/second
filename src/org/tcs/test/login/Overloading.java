package org.tcs.test.login;

public class Overloading {
	private void comId(int id) {
		System.out.println("company id is " +id);

	}
	private void comgth(float gth,String ly) {
		System.out.println("company growth is " +gth +"\t"+"last year growth is " +ly );

	}
	private void comgth(String ly,float gth) {
		System.out.println("last year growth is " +ly+"\t"+"company growth is " +gth);

	}
	private void empDetails(char bgrp,long phno) {
		System.out.println("employee blood group is " +bgrp+"\n"+"employee phone number " +phno);

	}

	public static void main(String[] args) {
		Overloading y=new Overloading();
		y.comId(45);
		y.comgth(5.5f, "less growth");
		y.comgth("less growth", 5.5f);
		y.empDetails('A', 7824046212l);

	}

}
