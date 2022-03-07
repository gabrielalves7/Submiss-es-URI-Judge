import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double N = input.nextDouble();

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n",(int) N/100);
        N%=100;

        System.out.printf("%d nota(s) de R$ 50.00%n",(int) N/50);
        N%=50;

        System.out.printf("%d nota(s) de R$ 20.00%n",(int) N/20);
        N%=20;

        System.out.printf("%d nota(s) de R$ 10.00%n",(int) N/10);
        N%=10;

        System.out.printf("%d nota(s) de R$ 5.00%n",(int) N/5);
        N%=5;

        System.out.printf("%d nota(s) de R$ 2.00%n",(int) N/2);
        N%=2;

        N*=100;

        System.out.println("MOEDAS:");

        System.out.printf("%d moeda(s) de R$ 1.00%n",(int)N/100);
        N%=100;

        System.out.printf("%d moeda(s) de R$ 0.50%n",(int)N/50);
        N%=50;

        System.out.printf("%d moeda(s) de R$ 0.25%n",(int)N/25);
        N%=25;

        System.out.printf("%d moeda(s) de R$ 0.10%n",(int)N/10);
        N%=10;

        System.out.printf("%d moeda(s) de R$ 0.05%n",(int)N/5);
        N%=5;

        System.out.printf("%d moeda(s) de R$ 0.01%n",(int)N/1);
    }
}
