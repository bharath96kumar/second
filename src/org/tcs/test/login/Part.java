package org.tcs.test.login;

public class Part extends Overriding {
	@Override
	public void comId(int id) {
		System.out.println("company id is " +id);
	}
	@Override
	public void comgth(float gth, String ly) {
		System.out.println("company growth is " +gth +"\t"+"last year growth is " +ly );
		
	}

	public static void main(String[] args) {
		Part p=new Part();
		p.comgth(10.25f, "efgh");
		p.comId(752);
	
		

	}

}
