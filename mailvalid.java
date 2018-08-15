package set4;

import java.util.Scanner;

public class mailvalid {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next();
	if(s.substring(s.length()-4,s.length()).equals(".com")){
		int ind=s.indexOf('@');
		int len=(s.substring(0,ind)).length();
		int lslen=(s.substring(ind,s.length()-4)).length();
		if(len>=3 && lslen>=4){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
	else{
		System.out.println("NO");
	}
}
}
