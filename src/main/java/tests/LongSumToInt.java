package tests;
public class LongSumToInt extends perftests.AbstractTest {
     public void run() {
         int s = 0;
         for (long i = 0; i < Integer.MAX_VALUE; i++)
             s += 1;
     }
}
