package com.tencent.mm.plugin.appbrand.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  private static Set<String> ipR;

  static
  {
    AppMethodBeat.i(132327);
    HashSet localHashSet = new HashSet();
    ipR = localHashSet;
    localHashSet.add(ag.ck("wx9a3998a6d8b89d42"));
    AppMethodBeat.o(132327);
  }

  public static boolean CU(String paramString)
  {
    AppMethodBeat.i(132326);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = true;
      AppMethodBeat.o(132326);
    }
    while (true)
    {
      return bool;
      bool = ipR.contains(ag.ck(paramString));
      AppMethodBeat.o(132326);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.c
 * JD-Core Version:    0.6.2
 */