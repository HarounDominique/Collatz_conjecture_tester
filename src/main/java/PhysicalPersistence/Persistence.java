package PhysicalPersistence;

import java.io.*;

public class Persistence {

    public void isCollatz(long testedNumber){
        try (FileWriter fw = new FileWriter("D:\\IntelliJ_Projects\\Collatz\\src\\main\\resources\\IsCollatz.txt", true)) {

            fw.write(String.valueOf(testedNumber));
            fw.write('\n');


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void notCollatz(long testedNumber){
        try (FileWriter fw = new FileWriter("D:\\IntelliJ_Projects\\Collatz\\src\\main\\resources\\NotCollatz.txt")) {

            fw.write(String.valueOf(testedNumber));
            fw.write('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

