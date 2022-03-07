import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int sort[] = new int[3];

        sort[0] = A;
        sort[1] = B;
        sort[2] = C;
        Arrays.sort(sort);

        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
