package tests;
public class IntSumLongCompare extends perftests.AbstractTest {
     public void run() {
         long l = 0;
         for (int i = 0; i < Integer.MAX_VALUE; i++) {
             l += 1;
             if (l >= Integer.MAX_VALUE)
                 break;
         }
     }
}
