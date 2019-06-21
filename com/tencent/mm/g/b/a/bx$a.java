package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum bx$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128725);
    der = new a("release", 0, 1);
    des = new a("debug", 1, 2);
    det = new a("demo", 2, 3);
    deu = new a[] { der, des, det };
    AppMethodBeat.o(128725);
  }

  private bx$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a gY(int paramInt)
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
      locala = der;
      continue;
      locala = des;
      continue;
      locala = det;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bx.a
 * JD-Core Version:    0.6.2
 */