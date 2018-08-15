package set4;

import java.util.Scanner;

public class divchk {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int cnt=0;
		for(int i=1;i<a;i++){
			if(a%i==0){
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

