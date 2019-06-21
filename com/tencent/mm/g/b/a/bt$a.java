package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum bt$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128688);
    ddU = new a("release", 0, 1);
    ddV = new a("debug", 1, 2);
    ddW = new a("demo", 2, 3);
    ddX = new a[] { ddU, ddV, ddW };
    AppMethodBeat.o(128688);
  }

  private bt$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a gU(int paramInt)
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
      locala = ddU;
      continue;
      locala = ddV;
      continue;
      locala = ddW;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bt.a
 * JD-Core Version:    0.6.2
 */