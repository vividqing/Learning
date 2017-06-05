import java.util.Scanner;

public class ninenine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    
    int i=0,j=0,k=0;
    System.out.print("九九乘法表\n");
    for(i=1;i<10;i++){
    	for(j=1;j<=i;j++){
    		k=i*j;
    		System.out.print(""+i+"×"+j+"="+k+"\t");
    	}
    	System.out.println("");
    	
    }
    
    
    
	}

}
