package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cf$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128804);
    dfG = new a("release", 0, 1);
    dfH = new a("debug", 1, 2);
    dfI = new a("demo", 2, 3);
    dfJ = new a[] { dfG, dfH, dfI };
    AppMethodBeat.o(128804);
  }

  private cf$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a hf(int paramInt)
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
      locala = dfG;
      continue;
      locala = dfH;
      continue;
      locala = dfI;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cf.a
 * JD-Core Version:    0.6.2
 */