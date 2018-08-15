package set4;

import java.util.Scanner;

public class strrptchk {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
	String s=in.next();
	String s1=in.next();
	int l=s1.length();
	int cnt=0;
	for(int i=0;i<=s.length()-l;i++){
		String a=s.substring(i,i+l);
		if(a.equals(s1)){
			cnt++;
		}
	}
	if(cnt>=1){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
