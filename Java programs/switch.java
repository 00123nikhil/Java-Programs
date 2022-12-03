import java.util.Scanner;

class switchcase{
    public static void main(String args[])
    {
        System.out.println("Enter your choice...");
        Scanner op=new Scanner(System.in);
        int button=sc.nextInt();

        switch(button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("namste"); 
            break;
            case 3:System.out.println("bonjour!");
            break;
            default :System.out.println("invalid option.......");
        }
    }
}