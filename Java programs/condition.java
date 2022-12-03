import java.util.Scanner;

class condition {
    public static void main(String args[]) {
        // apna college-condition statement
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("equal");
        } else {
            if (a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("b is greater");
            }
        }
    }
}