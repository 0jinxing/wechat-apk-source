package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum bs$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128678);
    ddO = new a("release", 0, 1);
    ddP = new a("debug", 1, 2);
    ddQ = new a("demo", 2, 3);
    ddR = new a[] { ddO, ddP, ddQ };
    AppMethodBeat.o(128678);
  }

  private bs$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a gT(int paramInt)
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
      locala = ddO;
      continue;
      locala = ddP;
      continue;
      locala = ddQ;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bs.a
 * JD-Core Version:    0.6.2
 */