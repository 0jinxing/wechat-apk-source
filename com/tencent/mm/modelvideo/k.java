package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;

public final class k
{
  public static final String ale()
  {
    AppMethodBeat.i(50727);
    String str = g.RP().eJM + "draft/";
    AppMethodBeat.o(50727);
    return str;
  }

  public static final String tX(String paramString)
  {
    AppMethodBeat.i(50728);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(50728);
    }
    while (true)
    {
      return paramString;
      paramString = ale() + paramString;
      AppMethodBeat.o(50728);
    }
  }

  public static final String tY(String paramString)
  {
    AppMethodBeat.i(50729);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(50729);
    }
    while (true)
    {
      return paramString;
      paramString = ale() + paramString + ".thumb";
      AppMethodBeat.o(50729);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.k
 * JD-Core Version:    0.6.2
 */