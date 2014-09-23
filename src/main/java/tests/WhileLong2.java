package tests;
public class WhileLong2 extends perftests.AbstractTest {
     public void run() {
         long i = 0;
         long j = 0;
         while (i < Integer.MAX_VALUE && j < Integer.MAX_VALUE) {
             i++;
             j++;
         }
     }
}
