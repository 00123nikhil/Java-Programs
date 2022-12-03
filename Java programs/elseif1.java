import java.util.Scanner;
class elseif1{
    public static void main(String args[])
    {
        System.out.println("enter your value");
        Scanner b=new Scanner(System.in);
        int button=b.nextInt();

        if(button ==1)
        System.out.println("hello");

        else if(button ==2)
        System.out.println("namaste");

        else if(button==3){
            System.out.println("bonjour!");
        }
        else{
            System.out.println("invalid options.....");
        }
    }
}