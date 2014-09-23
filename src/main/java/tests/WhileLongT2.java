package tests;
public class WhileLongT2 extends perftests.AbstractTest {
     public void run() {
         long i = 0;
         long j = 0;
         final long MAX = Integer.MAX_VALUE;
         while (i < MAX && j < MAX) {
             i++;
             j++;
         }
     }
}
