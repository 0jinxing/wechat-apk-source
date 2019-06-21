package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cg$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128820);
    dfS = new a("release", 0, 1);
    dfT = new a("debug", 1, 2);
    dfU = new a("demo", 2, 3);
    dfV = new a[] { dfS, dfT, dfU };
    AppMethodBeat.o(128820);
  }

  private cg$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a hg(int paramInt)
  {
    a locala;
    switch (paramInt)
    {
    default:
      locala = null;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return locala;
      locala = dfS;
      continue;
      locala = dfT;
      continue;
      locala = dfU;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cg.a
 * JD-Core Version:    0.6.2
 */