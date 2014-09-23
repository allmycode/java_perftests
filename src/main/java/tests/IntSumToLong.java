package tests;
class IntSumToLong extends perftests.AbstractTest {
     public void run() {
         long s = 0;
         for (int i = 0; i < Integer.MAX_VALUE; i++)
             s += 1;
     }
}
