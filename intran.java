package set4;

import java.util.Scanner;

public class intran {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	long a=in.nextLong();
	if(a>=-2147483648 && a<=2147483647){
		System.out.println("INT");
	}
	else{
		System.out.println("LONG");
	}
}
}
