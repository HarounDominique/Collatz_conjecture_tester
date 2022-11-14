package PhysicalPersistence;

import java.io.*;

public class Persistence {

    //Method that shows up in case the number complies the Collatz conjecture.
    //Its job is to write the number in a file.

    public void isCollatz(long testedNumber){
        try (FileWriter fw = new FileWriter("D:\\IntelliJ_Projects\\Collatz\\src\\main\\resources\\IsCollatz.txt", true)) {

            fw.write(String.valueOf(testedNumber));
            fw.write('\n');


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Method that shows up in case the number doesn't comply the Collatz conjecture.
    //Its job is to write the number in a (second) file.

    public void notCollatz(long testedNumber){
        try (FileWriter fw = new FileWriter("D:\\IntelliJ_Projects\\Collatz\\src\\main\\resources\\NotCollatz.txt")) {

            fw.write(String.valueOf(testedNumber));
            fw.write('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

