package tests;
public class LongSum extends perftests.AbstractTest {
     public void run() {
         long s = 0;
         for (long i = 0; i < Integer.MAX_VALUE; i++)
             s += 1;
     }
}
