package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cg$b
{
  final int value;

  static
  {
    AppMethodBeat.i(128823);
    dfW = new b("ok", 0, 0);
    dfX = new b("common_fail", 1, 1);
    dfY = new b[] { dfW, dfX };
    AppMethodBeat.o(128823);
  }

  private cg$b(int paramInt)
  {
    this.value = paramInt;
  }

  public static b hh(int paramInt)
  {
    b localb;
    switch (paramInt)
    {
    default:
      localb = null;
    case 0:
    case 1:
    }
    while (true)
    {
      return localb;
      localb = dfW;
      continue;
      localb = dfX;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cg.b
 * JD-Core Version:    0.6.2
 */