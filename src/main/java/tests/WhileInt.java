package tests;
public class WhileInt extends perftests.AbstractTest {
     public void run() {
         int i = 0;
         while (i < Integer.MAX_VALUE) {
             i++;
         }
     }
}
