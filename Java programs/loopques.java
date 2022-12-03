//print sum of first n natural numbers
import java.util.Scanner;
public class loopques{
    public static void main(String args[])
    {
        Scanner op=new Scanner(System.in);
        int n=op.nextInt();

        // int sum=0;
        // for(int i=0;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);

        //print table of number input by user
        for (int i=1;i<=10;i++)
        {
            System.out.println(i*n);
        }
    }
}