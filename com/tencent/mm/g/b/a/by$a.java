package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum by$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128736);
    dey = new a("release", 0, 1);
    dez = new a("debug", 1, 2);
    deA = new a("demo", 2, 3);
    deB = new a[] { dey, dez, deA };
    AppMethodBeat.o(128736);
  }

  private by$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a gZ(int paramInt)
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
      locala = dey;
      continue;
      locala = dez;
      continue;
      locala = deA;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.by.a
 * JD-Core Version:    0.6.2
 */