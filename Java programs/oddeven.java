import java.util.*;

class oddeven{
    public static void main(String args[])
    {
        //apana college-oddeven number
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your number:");
        int x = sc.nextInt();

        if (x % 20 ==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}