import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un número:");
        Scanner scan = new Scanner(System.in);
        long numero = scan.nextLong();

        while (true) {
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = (numero * 3) + 1;
            }

            System.out.println(numero);
        }
    }
}
