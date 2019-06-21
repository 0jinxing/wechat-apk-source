package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cl$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128885);
    dgR = new a("release", 0, 1);
    dgS = new a("debug", 1, 2);
    dgT = new a("demo", 2, 3);
    dgU = new a[] { dgR, dgS, dgT };
    AppMethodBeat.o(128885);
  }

  private cl$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a hm(int paramInt)
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
      locala = dgR;
      continue;
      locala = dgS;
      continue;
      locala = dgT;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cl.a
 * JD-Core Version:    0.6.2
 */