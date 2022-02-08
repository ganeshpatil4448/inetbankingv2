package inetbankingv2.inetbankingv2;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the string:");
		  
		  Scanner sc=new Scanner(System.in); String str=sc.nextLine();
		  
		  //String str2=str;
		  
		  StringBuilder str1=new StringBuilder(str); 
		  //StringBuffer str1=new StringBuffer(str);
		  System.out.println("The reverse string is:"+str1.reverse());
		  //System.out.println("str1="+str1);
		  //System.out.println("Pallindrome string is:"+str.equals(str1));
	}

}
