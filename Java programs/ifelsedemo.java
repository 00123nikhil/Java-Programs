import java.util.*;

class ifelsedemo{
    public static void main(String args[])
    {
        //apana college-ifelse 
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();

        if (age>18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("not adult");
        }
    }
}