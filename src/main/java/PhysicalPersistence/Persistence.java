package PhysicalPersistence;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Persistence {

    public void isCollatz(long numberTested){
        try (FileOutputStream fos = new FileOutputStream("D:\\IntelliJ_Projects\\Collatz\\src\\main\\resources\\Collatz.txt"); DataOutputStream dos = new DataOutputStream(fos)) {

            //dos.writeLong(numberTested);
            dos.writeChar((int) numberTested);
            dos.writeByte('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void notCollatz(long numberTested){
        try (FileOutputStream fos = new FileOutputStream("D:\\IntelliJ_Projects\\Collatz\\src\\main\\resources\\NoCollatz.txt"); DataOutputStream dos = new DataOutputStream(fos)) {

            //dos.writeLong(numberTested);
            dos.writeChar((int) numberTested);
            dos.writeByte('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

