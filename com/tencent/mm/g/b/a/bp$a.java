package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum bp$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128648);
    ddl = new a("release", 0, 1);
    ddm = new a("debug", 1, 2);
    ddn = new a("test", 2, 3);
    ddo = new a[] { ddl, ddm, ddn };
    AppMethodBeat.o(128648);
  }

  private bp$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a gP(int paramInt)
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
      locala = ddl;
      continue;
      locala = ddm;
      continue;
      locala = ddn;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bp.a
 * JD-Core Version:    0.6.2
 */