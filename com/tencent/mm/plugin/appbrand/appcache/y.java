package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.a;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.sdk.platformtools.bo;

public final class y
{
  private static String[] gTA = { "__APP__", "__WITHOUT_CODELIB__", "__CODELIB__" };
  private String appId;
  private String gTy;
  private volatile String gTz;

  public y(String paramString)
  {
    this.appId = paramString;
    this.gTy = null;
  }

  public y(String paramString1, String paramString2)
  {
    AppMethodBeat.i(101719);
    this.appId = paramString1;
    this.gTy = xs(paramString2);
    AppMethodBeat.o(101719);
  }

  public y(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(101721);
    if (paramInt == 13);
    for (paramString2 = xs(paramString2) + '$' + "__WITHOUT_CODELIB__"; ; paramString2 = xs(paramString2))
    {
      this.gTy = paramString2;
      this.appId = paramString1;
      AppMethodBeat.o(101721);
      return;
    }
  }

  private static String xs(String paramString)
  {
    AppMethodBeat.i(101720);
    if ((bo.isNullOrNil(paramString)) || (a.contains(gTA, paramString)))
      AppMethodBeat.o(101720);
    while (true)
    {
      return paramString;
      paramString = l.yk(paramString);
      AppMethodBeat.o(101720);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(101722);
    StringBuilder localStringBuilder;
    if (bo.isNullOrNil(this.gTz))
    {
      localStringBuilder = new StringBuilder().append(this.appId);
      if (!bo.isNullOrNil(this.gTy))
        break label67;
    }
    label67: for (String str = ""; ; str = "$" + this.gTy)
    {
      this.gTz = str;
      str = this.gTz;
      AppMethodBeat.o(101722);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.y
 * JD-Core Version:    0.6.2
 */