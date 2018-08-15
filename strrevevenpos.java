import java.util.Scanner;
public class strrevevenpos {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	String s1[]=s.split(" ");
	String s2[]=new String[s1.length];
	for(int i=0;i<s1.length;i++){
		if(i%2==0){
			s2[i]=new StringBuffer(s1[i]).reverse().toString();
		}
		else{
			s2[i]=s1[i];
		}
	}
	for(int i=0;i<s2.length;i++){
		System.out.print(s2[i]+" ");
	}
}
}
