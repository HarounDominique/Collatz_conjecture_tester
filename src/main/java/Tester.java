import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    //Attributes
    long number;
    long aux;
    ArrayList<Long> tail = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    Persistence persistencia = new Persistence();

    public Tester() {

        System.out.println("Introduce un número:");

        number = scan.nextLong();

        aux = number;

        for (long i=0; i<aux*3; i++) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }

            if(i>=(aux*3)-3){
                tail.add(number);
            }

        }

        for(Long l : tail){
            System.out.println(l);
        }

        if(tail.get(0) == 4 && tail.get(1)==2 && tail.get(2)==1){
            System.out.println("Collatz confirmed");
            persistencia.collatz(number);

        }else if (tail.get(0) == 2 && tail.get(1)==1 && tail.get(2)==4) {
            System.out.println("Collatz confirmed");
            persistencia.collatz(number);

        }else if (tail.get(0) == 1 && tail.get(1)==4 && tail.get(2)==2){
            System.out.println("Collatz confirmed");
            persistencia.collatz(number);

        }else{
            System.out.println("You just made history");
            persistencia.noCollatz(number);
        }
    }
}
