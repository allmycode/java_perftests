package tests;
import java.nio.*;
import sun.misc.Cleaner;
import sun.nio.ch.DirectBuffer;

public class DirectBBNoCheck extends perftests.AbstractTest {
    ByteBuffer bb = ByteBuffer.allocateDirect(1024*1024*1024);

    public DirectBBNoCheck() { 
        for (int i = 0; i < bb.capacity(); i++) {
            bb.put(i, (byte)(i % 2 == 0 ? 1 : 0));
        }
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < bb.capacity(); i++) {
            byte b = bb.get(i);
            sum += b;
        }
    }
}
