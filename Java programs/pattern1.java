//nested loop in java
import java.util.Scanner;
public class pattern1{
    public static void main(String args[])
    {
        int m,n;
        Scanner op=new Scanner(System.in);
        m=op.nextInt();
        n=op.nextInt();
        //pattern in java
        //outer loop 
       
        for(int i=1;i<=m;i++)
        {
            //inner loop
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
                System.out.println("");
        }
    }
}