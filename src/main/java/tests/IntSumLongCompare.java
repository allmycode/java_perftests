package tests;
class IntSumLongCompare extends perftests.AbstractTest {
     public void run() {
         int s = 0;
         long l = 0;
         while (true) {
             s += 1;
             l += 1;
             if (l >= Integer.MAX_VALUE)
                 break;
         }
     }
}
