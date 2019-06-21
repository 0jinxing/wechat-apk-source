package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ca$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128760);
    deM = new a("release", 0, 1);
    deN = new a("debug", 1, 2);
    deO = new a("demo", 2, 3);
    deP = new a[] { deM, deN, deO };
    AppMethodBeat.o(128760);
  }

  private ca$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a hb(int paramInt)
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
      locala = deM;
      continue;
      locala = deN;
      continue;
      locala = deO;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ca.a
 * JD-Core Version:    0.6.2
 */