// Module definition for the main application module.
module appstart {
  // Requires the module appfuncs.
  requires appfuncs;
  requires userfuncs;

  // appstart now uses BinFuncProvider
  uses userfuncs.binaryfuncs.BinFuncProvider;
}