package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinFuncProvider;
import userfuncs.binaryfuncs.BinaryFunc;

public class AbsMinusProvider implements BinFuncProvider {

  // Provide an AbsPlus object.
  @Override
  public BinaryFunc get() { return new AbsMinus(); }
}