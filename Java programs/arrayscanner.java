import java.util.Scanner;

public class arrayscanner {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int size = op.nextInt();
        int[] number = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            number[i] = op.nextInt();
        }
        // output
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
    }
}
