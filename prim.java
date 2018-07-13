public class prm {
public static void main(String[] args) {
	int no=Integer.parseInt(args[0]);
	int flag=0;
	if(no==0 || no==1){System.out.println("no");}
	for(int i=2;i<=(no/2);i++){
		if(no%i==0){
			System.out.println("no");
			flag=1;
			break;
		}
	}
	if(flag==0){
		System.out.println("yes");
	}
}
}
