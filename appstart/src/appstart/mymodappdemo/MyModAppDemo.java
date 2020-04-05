// Demonstrate a simple module-based application.
package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import userfuncs.binaryfuncs.BinFuncProvider;
import userfuncs.binaryfuncs.BinaryFunc;

import java.util.ServiceLoader;

public class MyModAppDemo {
  public static void main(String[] args) {
    if(SimpleMathFuncs.isFactor(2, 10)) System.out.println("2 is a factor of 10");
    System.out.println("Smallest factor common to both 35 and 105 is " +
            SimpleMathFuncs.lcf(35, 105));
    System.out.println("Largest factor common to both 35 and 105 is " +
            SimpleMathFuncs.gcf(35, 105));

    System.out.println("Smallest factor common to both 7 and 17 is " +
            SimpleMathFuncs.lcf(7, 17));
    System.out.println("Largest factor common to both 7 and 17 is " +
            SimpleMathFuncs.gcf(7, 17));

    // Now,  use service-based, user defined operations.

    // Get a service loader for binary functions.
    ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);
    System.out.println(" + " + BinFuncProvider.class);
    System.out.println(" -- " + ldr);

    BinaryFunc binOp = null;

    // Find the provider for AbsPlus and obtain the function.

    for(BinFuncProvider bfp: ldr) {
      System.out.println(">>> " + bfp.get().getName());
      if(bfp.get().getName().equals("AbsPlus")) {
        binOp = bfp.get();
        break;
      }
    }

    if(binOp != null) System.out.println("Result of absPlus function: " + binOp.func(12, -4));
    else System.out.println("AbsPlus function not found");

    binOp = null;

    // Now, find the provider for absMinus and obtain the function.
    for(BinFuncProvider bfp: ldr) {
      System.out.println(">>> " + bfp.get().getName());
      if(bfp.get().getName().equals("AbsMinus")) {
        binOp = bfp.get();
        break;
      }
    }

    if(binOp != null) System.out.println("Result of absMinus function: " + binOp.func(12, -4));
    else System.out.println("AbsMinus function not found");
  }
}
