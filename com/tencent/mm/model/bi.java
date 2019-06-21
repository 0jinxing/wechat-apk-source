package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.k;

public final class bi
{
  public static a fmO = null;

  public static k a(k paramk)
  {
    AppMethodBeat.i(58107);
    if (fmO == null)
      AppMethodBeat.o(58107);
    while (true)
    {
      return paramk;
      paramk = fmO.aah();
      AppMethodBeat.o(58107);
    }
  }

  public static int aag()
  {
    AppMethodBeat.i(58108);
    int i;
    if (fmO != null)
    {
      i = fmO.aag();
      AppMethodBeat.o(58108);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(58108);
    }
  }

  public static abstract interface a
  {
    public abstract int aag();

    public abstract k aah();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bi
 * JD-Core Version:    0.6.2
 */