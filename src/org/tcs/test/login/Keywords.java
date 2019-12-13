package org.tcs.test.login;

public class Keywords {

	public static void main(String[] args) {
	   String s = "bharath";
       int l=s.length();
	   System.out.println(l);
	   char a=s.charAt(5);
	   System.out.println(a);
	   String u=s.toUpperCase();
	   System.out.println(u);
	   String lo=s.toLowerCase();
	   System.out.println(lo);
	   boolean sw=s.startsWith("bha");
	   System.out.println(sw);
	   boolean ew=s.endsWith("eiew");
	   System.out.println(ew);
	   int in=s.indexOf('r');
       System.out.println(in);
       int la=s.lastIndexOf('h');
       System.out.println(la);
       String re=s.replace('b','s');
       System.out.println(re);
       String t="kumar";
       String co=s.concat(t);
       System.out.println(co);
       String z="How can I help you";
    		   String sb=z.substring(5,11);
    		   System.out.println(sb);
    		   boolean ct=z.contains("you");
    		   System.out.println(ct);
       
    
	}

}
