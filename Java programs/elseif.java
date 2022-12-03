import java.util.Scanner;

class elseif{
    public static void main(String args[])
    {
        //apna college-else if condition 
        System.out.println("enter your value");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (a==b){
            System.out.println("equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }
    }
}