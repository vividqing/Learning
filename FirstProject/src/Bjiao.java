import java.util.Scanner;

public class Bjiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner s= new Scanner(System.in);
	  int a=s.nextInt();
	  int b=s.nextInt();
	  int c=s.nextInt();
	  int max;
	  if (a<b) {
		  max=b;
		  if (max>c) {
			System.out.print(max);
		 }else{
			if(a<c){
			System.out.print(c);	
			}else{
			System.out.print(a);
			}
		}


	}
	  else{max=a;
	  if(b>c){
		  System.out.print(max);
	  }else{
		  if (a<c) {
			System.out.print(c);
		}else{
			System.out.print(max);
		}
	  }
	  
		  
	  }	  
	}

}
