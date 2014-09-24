package tests;
import java.nio.*;
import sun.misc.Cleaner;
import sun.nio.ch.DirectBuffer;

public class Bytes1G extends perftests.AbstractTest {
    byte[] buf = new byte[1024*1024*1024*2];
    int sum;
    public Bytes1G() { 
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte)(i % 2 == 0 ? 1 : 0);
        }
    }

    public void run() {
        sum = 0;
        for (int i = 0; i < buf.length; i++) {
            sum += buf[i];
        }
        //System.out.println(sum);
    }
}
