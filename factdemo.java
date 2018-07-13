public class factdemo {
public static void main(String[] args) {
	int no=Integer.parseInt(args[0]);
	int sum=1,tot;
	if(no<=20){
	for(int i=1;i<no;i++){
	tot=i+1;
	sum=sum*tot;
	}
	System.out.println(sum);}
}
}
