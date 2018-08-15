package set4;

import java.util.Scanner;

public class sentencerev {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	String s1[]=s.split(" ");
	//System.out.println("length is "+s1.length);
	for(int i=s1.length-1;i>=0;i--){
		System.out.print(s1[i]+" ");
	}
//	String rev=new StringBuffer(s).reverse().toString();
	//System.out.println(rev);
}
}
