import java.util.Scanner;

class calculator {
    public static void main(String args[]) {
        int a, b, c, ch;
        System.out.println("Enter the two values :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("enter your choice");
        ch = sc.nextInt();

        switch (ch) // what is switch : it is a multiple choice decision making selection statement
        {
            case 1:
                c = a + b;
                System.out.println("addition is " + c);
                break;

            case 2:
                c = a - b;
                System.out.println("substraction is" + c);
                break;

            case 3:
                c = a * b;
                System.out.println("multiplication is" + c);
                break;

            case 4:
                c = a / b;
                System.out.println("division is " + c);
                break;

            default:
                System.out.println("Invalid Choice......");

        }

    }
}