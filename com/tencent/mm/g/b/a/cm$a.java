package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cm$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128897);
    dgW = new a("release", 0, 1);
    dgX = new a("debug", 1, 2);
    dgY = new a("demo", 2, 3);
    dgZ = new a[] { dgW, dgX, dgY };
    AppMethodBeat.o(128897);
  }

  private cm$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a hn(int paramInt)
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
      locala = dgW;
      continue;
      locala = dgX;
      continue;
      locala = dgY;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cm.a
 * JD-Core Version:    0.6.2
 */