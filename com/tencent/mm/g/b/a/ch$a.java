package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ch$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128834);
    dgd = new a("release", 0, 1);
    dge = new a("debug", 1, 2);
    dgf = new a("demo", 2, 3);
    dgg = new a[] { dgd, dge, dgf };
    AppMethodBeat.o(128834);
  }

  private ch$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a hi(int paramInt)
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
      locala = dgd;
      continue;
      locala = dge;
      continue;
      locala = dgf;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ch.a
 * JD-Core Version:    0.6.2
 */