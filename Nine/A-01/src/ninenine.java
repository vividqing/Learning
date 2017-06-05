// import java.util.Scanner; // 这个导包没用

public class ninenine {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Scanner s = new Scanner(System.in); // 这个Scanner 用不上
    
        int i=0,j=0,k=0;
        System.out.print("九九乘法表\n");
        for(i=1;i<10;i++){
            for(j=1;j<=i;j++){
                k=i*j;
                System.out.print(i+"×"+j+"="+k+"\t");
            }
            System.out.println(); // 这行代码的作用是换行，可以传空参数
        }
    }
}
