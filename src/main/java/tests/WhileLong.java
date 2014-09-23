package tests;
class WhileLong extends perftests.AbstractTest {
     public void run() {
         int s = 0;
         long i = 0;
         while (i < Integer.MAX_VALUE) {
             i++;
             s+=1;
         }
     }
}
