
//take an array as input from user.search for given no x and print the index at which is occurs
import java.util.Scanner;

public class arrproblem {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int size = op.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = op.nextInt();
        }
        int x = op.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index :" + i);
            }
        }
    }
}
