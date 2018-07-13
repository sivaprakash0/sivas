public class pal {
public static void main(String[] args) {
	int no=Integer.parseInt(args[0]);
	if(no>=1000){
   String re=Integer.toString(no);
   String reor=new StringBuffer(re).reverse().toString(); 
   if(re.equals(reor)){
	   System.out.println("yes");
   }
   else{System.out.println("no");}
}
}
}
