package tests;
class IntSum extends perftests.AbstractTest {
     public void run() {
         int s = 0;
         for (int i = 0; i < Integer.MAX_VALUE; i++)
             s += 1;
     }
}
