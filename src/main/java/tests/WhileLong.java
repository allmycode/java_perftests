package tests;
public class WhileLong extends perftests.AbstractTest {
     public void run() {
         long i = 0;
         while (i < Integer.MAX_VALUE) {
             i++;
         }
     }
}
