package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum bq$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128658);
    ddD = new a("release", 0, 1);
    ddE = new a("debug", 1, 2);
    ddF = new a("demo", 2, 3);
    ddG = new a[] { ddD, ddE, ddF };
    AppMethodBeat.o(128658);
  }

  private bq$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a gR(int paramInt)
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
      locala = ddD;
      continue;
      locala = ddE;
      continue;
      locala = ddF;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bq.a
 * JD-Core Version:    0.6.2
 */