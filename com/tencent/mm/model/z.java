package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.bq.a;

public final class z
{
  private static String af(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77808);
    String str = "";
    if (paramString1 != null)
      str = "" + paramString1.replace("@", "");
    paramString1 = str;
    if (paramString2 != null)
      paramString1 = str + paramString2;
    AppMethodBeat.o(77808);
    return paramString1;
  }

  public static y ag(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77809);
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      AppMethodBeat.o(77809);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      paramString1 = ((j)g.K(j.class)).XU().RA(paramString1);
      if ((paramString1 == null) || (!paramString1.dun()))
      {
        AppMethodBeat.o(77809);
        paramString1 = null;
      }
      else
      {
        paramString1 = new y("@domain.android", paramString1.name, af(paramString1.xZV.apT(""), paramString2), paramString1.xZV.apT(""), paramString1.isEnable(), true);
        AppMethodBeat.o(77809);
      }
    }
  }

  public static y nY(String paramString)
  {
    AppMethodBeat.i(77806);
    paramString = new y("@black.android", null, paramString, null, true, true);
    AppMethodBeat.o(77806);
    return paramString;
  }

  public static y nZ(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(77807);
    bq localbq = ((j)g.K(j.class)).XU().RA("@t.qq.com");
    if (localbq == null)
    {
      AppMethodBeat.o(77807);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = new y("@t.qq.com", null, paramString, null, localbq.isEnable(), localbq.dum());
      AppMethodBeat.o(77807);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.z
 * JD-Core Version:    0.6.2
 */