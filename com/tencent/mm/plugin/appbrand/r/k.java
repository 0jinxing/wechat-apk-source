package com.tencent.mm.plugin.appbrand.r;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class k
{
  public static <T extends a> boolean a(T paramT1, T paramT2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(57066);
    if ((paramT1 == null) && (paramT2 == null))
    {
      paramT1 = new IllegalArgumentException("both null!!!");
      AppMethodBeat.o(57066);
      throw paramT1;
    }
    boolean bool2;
    if (paramT1 == null)
    {
      AppMethodBeat.o(57066);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (paramT2 == null)
      {
        AppMethodBeat.o(57066);
        bool2 = bool1;
      }
      else
      {
        try
        {
          bool2 = bo.isEqual(paramT1.toByteArray(), paramT2.toByteArray());
          AppMethodBeat.o(57066);
        }
        catch (Exception paramT1)
        {
          AppMethodBeat.o(57066);
          bool2 = bool1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.k
 * JD-Core Version:    0.6.2
 */