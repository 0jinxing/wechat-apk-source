package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cj$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128859);
    dgB = new a("release", 0, 1);
    dgC = new a("debug", 1, 2);
    dgD = new a("demo", 2, 3);
    dgE = new a[] { dgB, dgC, dgD };
    AppMethodBeat.o(128859);
  }

  private cj$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a hk(int paramInt)
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
      locala = dgB;
      continue;
      locala = dgC;
      continue;
      locala = dgD;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cj.a
 * JD-Core Version:    0.6.2
 */