package tests;
public class WhileLongT extends perftests.AbstractTest {
     public void run() {
         long i = 0;
         final long MAX = Integer.MAX_VALUE;
         while (i < MAX) {
             i++;
         }
     }
}
