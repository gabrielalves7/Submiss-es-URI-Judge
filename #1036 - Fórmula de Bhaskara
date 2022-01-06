import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double delta = 0;
        double R1 = 0;
        double R2 = 0;

        delta = Math.pow(B,2) - (4 * A * C);
        if (2*A ==0 || delta <=0 ) {
            System.out.println("Impossivel calcular");
        } else {
            R1 = (-B + Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f\n", R1);

            R2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R2 = %.5f\n", R2);
        }

    }
}
