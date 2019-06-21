package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum bv$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128708);
    def = new a("release", 0, 1);
    deg = new a("debug", 1, 2);
    deh = new a("demo", 2, 3);
    dei = new a[] { def, deg, deh };
    AppMethodBeat.o(128708);
  }

  private bv$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a gW(int paramInt)
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
      locala = def;
      continue;
      locala = deg;
      continue;
      locala = deh;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bv.a
 * JD-Core Version:    0.6.2
 */