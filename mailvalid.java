import java.util.Scanner;
public class mailvalid {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next();
	int cn=0;
	for(int i=0;i<s.length();i++){
		char c[]=s.toCharArray();
		if(c[i]=='@'){
			cn++;
		}
	}
	if(cn==1 && s.substring(s.length()-4,s.length()).equals(".com")){
		int ind=s.indexOf('@');
		int len=(s.substring(0,ind)).length();
		int lslen=(s.substring(ind,s.length()-4)).length();
		if(len>=3 && lslen>=4){
			int cnt=0,cnt1=0;
			for(int i=0;i<len;i++){
				char c1[]=(s.substring(0,ind)).toCharArray();
				if(c1[i]!='.'){
					cnt++;
				}
			}
			for(int i=0;i<lslen;i++){
				char c2[]=(s.substring(ind,s.length()-4)).toCharArray();
				if(c2[i]!='.'){
					cnt1++;
				}
			}
			if(cnt==len && cnt1==lslen){
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
	else{
		System.out.println("NO");
	}
}
}
