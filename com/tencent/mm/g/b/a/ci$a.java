package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ci$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128850);
    dgr = new a("release", 0, 1);
    dgs = new a("debug", 1, 2);
    dgt = new a("demo", 2, 3);
    dgu = new a[] { dgr, dgs, dgt };
    AppMethodBeat.o(128850);
  }

  private ci$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a hj(int paramInt)
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
      locala = dgr;
      continue;
      locala = dgs;
      continue;
      locala = dgt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ci.a
 * JD-Core Version:    0.6.2
 */