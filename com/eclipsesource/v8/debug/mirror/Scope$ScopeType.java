package com.eclipsesource.v8.debug.mirror;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum Scope$ScopeType
{
  int index;

  static
  {
    AppMethodBeat.i(74901);
    Global = new ScopeType("Global", 0, 0);
    Local = new ScopeType("Local", 1, 1);
    With = new ScopeType("With", 2, 2);
    Closure = new ScopeType("Closure", 3, 3);
    Catch = new ScopeType("Catch", 4, 4);
    Block = new ScopeType("Block", 5, 5);
    Script = new ScopeType("Script", 6, 6);
    $VALUES = new ScopeType[] { Global, Local, With, Closure, Catch, Block, Script };
    AppMethodBeat.o(74901);
  }

  private Scope$ScopeType(int paramInt)
  {
    this.index = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.Scope.ScopeType
 * JD-Core Version:    0.6.2
 */