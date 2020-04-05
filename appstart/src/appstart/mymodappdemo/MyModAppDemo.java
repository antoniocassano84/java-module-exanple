// Demonstrate a simple module-based application.
package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo {
  public static void main(String[] args) {

    System.out.println("ciao");

    if(SimpleMathFuncs.isFactor(2, 10)) System.out.println("2 is a factor of 10");
    System.out.println("Smallest factor common to both 35 and 105 is " +
            SimpleMathFuncs.lcf(35, 105));
    System.out.println("Largest factor common to both 35 and 105 is " +
            SimpleMathFuncs.gcf(35, 105));

    System.out.println("Smallest factor common to both 7 and 17 is " +
            SimpleMathFuncs.lcf(7, 17));
    System.out.println("Largest factor common to both 7 and 17 is " +
            SimpleMathFuncs.gcf(7, 17));
  }
}
