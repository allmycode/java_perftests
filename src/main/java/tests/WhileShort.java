package tests;
public class WhileShort extends perftests.AbstractTest {
     public void run() {
         short i = 0;
         int d = Integer.MAX_VALUE;
         while (true) {
             i++;
             if (i == Short.MAX_VALUE) {
                 d--;
                 i = 0;
                 if (d == 0)
                     break;
             }
         }
     }
}
