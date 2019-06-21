package com.tencent.mm.compatible.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a
{
  private static volatile a.a epC;

  static
  {
    AppMethodBeat.i(92909);
    epB = new a("INSTANCE");
    epD = new a[] { epB };
    epC = new a.1();
    AppMethodBeat.o(92909);
  }

  public static void a(a.a parama)
  {
    try
    {
      epC = parama;
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public static void eT(long paramLong)
  {
    AppMethodBeat.i(92907);
    epC.u(853L, paramLong);
    AppMethodBeat.o(92907);
  }

  public static void eU(long paramLong)
  {
    AppMethodBeat.i(92908);
    epC.u(650L, paramLong);
    AppMethodBeat.o(92908);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.d.a
 * JD-Core Version:    0.6.2
 */