import java.util.Scanner;
public class arrsrtch {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int arr[]=new int[sz];
	int cnt=0;
	for(int i=0;i<sz;i++){
		arr[i]=in.nextInt();
	}
	for(int j=0;j<sz-1;j++){
		if(arr[j]<arr[j+1]){
			cnt++;
		}
	}
	if(cnt==arr.length-1){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
