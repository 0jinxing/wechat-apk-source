package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum bu$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128698);
    ddZ = new a("release", 0, 1);
    dea = new a("debug", 1, 2);
    deb = new a("demo", 2, 3);
    dec = new a[] { ddZ, dea, deb };
    AppMethodBeat.o(128698);
  }

  private bu$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a gV(int paramInt)
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
      locala = ddZ;
      continue;
      locala = dea;
      continue;
      locala = deb;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bu.a
 * JD-Core Version:    0.6.2
 */