import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario = input.nextDouble();
        double imposto;
        double imposto1 = 80.00;
        double imposto2 = 270.00;

        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            imposto = salario - 2000.01;
            imposto *= 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            imposto = salario - 3000.01;
            imposto *= 0.18;
            System.out.printf("R$ %.2f\n", imposto + imposto1);
        } else if (salario >= 4500.00) {
            imposto = salario - 4500.00;
            imposto *= 0.28;
            System.out.printf("R$ %.2f\n", imposto+imposto1+imposto2);
        }
    }
}
