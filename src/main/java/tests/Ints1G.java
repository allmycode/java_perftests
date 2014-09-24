package tests;
import java.nio.*;
import sun.misc.Cleaner;
import sun.nio.ch.DirectBuffer;

public class Ints1G extends perftests.AbstractTest {
    int[] buf = new int[1024*1024*500];
    int sum;
    public Ints1G() { 
        for (int i = 0; i < buf.length; i++) {
            buf[i] = i % 2 == 0 ? 1 : 0;
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
