import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduce un número:");
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        long aux = number;

        ArrayList<Long> tail = new ArrayList<>();

        for (long i=0; i<aux*3; i++) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }

            //System.out.println(number);

            if(i>=(aux*3)-3){
                tail.add(number);
            }

        }
        for(Long l : tail){
            System.out.println(l);
        }
    }
}
