import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        String C = input.next();

        if (A.equalsIgnoreCase("vertebrado")) {
            if (B.equalsIgnoreCase("ave")) {
                if (C.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else if (B.equalsIgnoreCase("mamifero")) {
                if (C.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else if (C.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (A.equalsIgnoreCase("invertebrado")) {
            if (B.equalsIgnoreCase("inseto")) {
                if (C.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else if (C.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (B.equalsIgnoreCase("anelideo")){
                if (C.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (C.equalsIgnoreCase("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}
